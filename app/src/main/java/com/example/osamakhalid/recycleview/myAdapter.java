package com.example.osamakhalid.recycleview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Osama Khalid on 12/24/2017.
 */

public class myAdapter extends RecyclerView.Adapter<myAdapter.myViewHolder> {
    private String [] data;
    public myAdapter(String [] data){
        this.data=data;
    }

    @Override
    public myViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        System.out.println("checkingg onCreateViewHolder");
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_item,parent,false);
        return new myViewHolder(view);
    }

    @Override
    public void onBindViewHolder(myViewHolder holder, int position) {
        System.out.println("checkingg onBindViewHolder");
        holder.name.setText(data[position]);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class myViewHolder extends RecyclerView.ViewHolder{
        TextView name;
        public myViewHolder(View itemView) {
            super(itemView);
            name =(TextView) itemView.findViewById(R.id.name);
        }
    }
}
