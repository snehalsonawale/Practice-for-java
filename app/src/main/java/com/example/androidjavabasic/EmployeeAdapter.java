package com.example.androidjavabasic;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

class EmployeeAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {


    private Context context;
    ArrayList<Employee> employees;


    private static int TYPE_CALL = 1;
    private static int TYPE_EMAIL = 2;

    public EmployeeAdapter( Context context,ArrayList<Employee> employees) {

        this.employees = employees;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       // return null;

        View view;
        if (viewType == Constance.TYPE_CALL) { // for call layout
            view = LayoutInflater.from(context).inflate(R.layout.item_call, parent, false);
            return new CallViewHolder(view);

        } else { // for email layout
            view = LayoutInflater.from(context).inflate(R.layout.item_email, parent, false);
            return new EmailViewHolder(view);
        }
    }


    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Employee employee = employees.get(position);

        if (getItemViewType(position) == TYPE_CALL) {
            ((CallViewHolder) holder).setCallDetails(employees.get(position));
        } else {
            ((EmailViewHolder) holder).setEmailDetails(employees.get(position));
        }
    }

    @Override
    public int getItemCount() {
        return employees.size();
        //return 0;
    }


    @Override
    public int getItemViewType(int position) {
       // return super.getItemViewType(position);

        if (TextUtils.isEmpty(employees.get(position).getEmail())) {
           // return TYPE_CALL;
            return Constance.TYPE_CALL;

        } else {
           // return TYPE_EMAIL;
            return Constance.TYPE_EMAIL;
        }
    }

    class CallViewHolder extends RecyclerView.ViewHolder {

        private TextView txtName;
        private TextView txtAddress;

        CallViewHolder(@NonNull View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.txtName);
            txtAddress = itemView.findViewById(R.id.txtAddress);
        }

        public void setCallDetails(Employee employee) {

            txtName.setText(employee.getName());
            txtAddress.setText(employee.getAddress());
        }
    }





    class EmailViewHolder extends RecyclerView.ViewHolder {

        private TextView txtName;
        private TextView txtAddress;

        EmailViewHolder(@NonNull View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.txtName);
            txtAddress = itemView.findViewById(R.id.txtAddress);
        }

        public void setEmailDetails(Employee employee) {
            txtName.setText(employee.getName());
            txtAddress.setText(employee.getAddress());
        }
    }
}
