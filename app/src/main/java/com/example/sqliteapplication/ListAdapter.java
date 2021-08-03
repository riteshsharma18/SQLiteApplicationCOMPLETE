package com.example.sqliteapplication;

import android.app.AlertDialog;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder>{

    private List<User> users;
    public ListAdapter(List<User> users){
        this.users = users;
    }
    private Context context;

    @NonNull
    @Override
    public ListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View userList = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_information_cell,parent,false);
        context = parent.getContext();

        ViewHolder vh = new ViewHolder(userList, context, users);
        return vh ;
    }

    @Override
    public void onBindViewHolder(@NonNull ListAdapter.ViewHolder holder, int position) {

        User u = users.get(position);

        holder.name.setText(u.getName());
        holder.dob.setText(u.getDob());
        holder.id.setText(u.getId());


    }

    @Override
    public int getItemCount() {
        return users.size();
    }








    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
    {
        @Override
        public void onClick(View view) {
           Log.d("TAG",context.toString());

            AlertDialog.Builder builder = new AlertDialog.Builder(this.context);
            builder.setCancelable(true);
            builder.setTitle("Results");
            builder.setMessage(users.get(getAdapterPosition()).toString());
            builder.show();
        }

        public TextView name;
        public TextView id;
        public TextView dob;
        private Context context;
        private List<User> users;
        public ViewHolder(@NonNull View itemView, Context context, List<User> u) {


            super(itemView);
            this.context = context;
            itemView.setOnClickListener(this);
            this.users = u;
            name = itemView.findViewById(R.id.name);
            id = itemView.findViewById(R.id.userID);
            dob = itemView.findViewById(R.id.dob);
        }
    }


}
