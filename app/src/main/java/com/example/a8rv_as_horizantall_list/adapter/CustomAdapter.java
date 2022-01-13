package com.example.a8rv_as_horizantall_list.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a8rv_as_horizantall_list.R;
import com.example.a8rv_as_horizantall_list.model.User;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context context;
    private List<User> users;

    public CustomAdapter(Context context, List<User> users) {
        this.context = context;
        this.users = users;
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout_view, parent, false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        User user = users.get(position);
        if (holder instanceof CustomViewHolder){
            TextView abubakr =((CustomViewHolder)holder).abubakr;
            TextView akmal = ((CustomViewHolder)holder).akmal;

            abubakr.setText(user.getAbubakr());
            akmal.setText(user.getAkmal());
        }
    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    class CustomViewHolder extends RecyclerView.ViewHolder {
        public TextView abubakr, akmal;
        public View view;

        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView;

            abubakr = view.findViewById(R.id.abubakr);
            akmal = view.findViewById(R.id.akmal);
        }
    }
}
