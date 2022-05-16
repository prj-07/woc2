package com.example.wocagain;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

     private List<RetroPhoto> postlist;
    Context context;

    public MyAdapter(Context context,List <RetroPhoto> postlist) {
        this.postlist = postlist;
        this.context = context;
    }

    public MyAdapter(Context postlist) {
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
    holder.tvbody.setText(postlist.get(position).getTitle());
        holder.tvtuserid.setText(postlist.get(position).getUserId());
        holder.tvid.setText(postlist.get(position).getId());
        holder.tvbody.setText(postlist.get(position).getBody());


    }

    @Override
    public int getItemCount() {
        return postlist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {


        TextView tvtitle;
        TextView tvid;
        TextView tvtuserid;
        TextView tvbody;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvtitle = itemView.findViewById(R.id.tvtitle);
            tvid = itemView.findViewById(R.id.tvid);
            tvtuserid = itemView.findViewById(R.id.tvuserid);
            tvbody= itemView.findViewById(R.id.tvbody);



        }
    }
}
