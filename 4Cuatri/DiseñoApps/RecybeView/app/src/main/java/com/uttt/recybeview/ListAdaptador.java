package com.uttt.recybeview;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ListAdaptador extends RecyclerView.Adapter<ListAdaptador.ViewHolder> {
    private List<ListElement> mData;
    private LayoutInflater mInflater;
    private Context contex;

    public ListAdaptador(List<ListElement> itemList, Context contex) {
        this.mData = itemList;
        this.mInflater = LayoutInflater.from(contex);
        this.contex = contex;
    }
    @Override
    public int getItemCount(){return mData.size();}

    @Override
    public ListAdaptador.ViewHolder onCreateViewHolder(ViewGroup parent,int viewType){
        View view= mInflater.inflate(R.layout.list_element,null);
        return new ListAdaptador.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bindData(mData.get(position));
    }
    public void setItems(List<ListElement>items){mData=items;}
    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView iconImage;
        TextView name,city,status;

        ViewHolder(View itemView){
            super(itemView);
            iconImage=itemView.findViewById(R.id.iconImageView);
            name=itemView.findViewById(R.id.nameTextView);
            city=itemView.findViewById(R.id.cityTextView);
            status=itemView.findViewById(R.id.statusTextView);
        }
        void bindData(final ListElement item){
            iconImage.setColorFilter(Color.parseColor(item.getColor()),PorterDuff.Mode.SRC_IN);
            name.setText(item.getName());
            city.setText(item.getCity());
            status.setText(item.getStatus());
        }
    }
}
