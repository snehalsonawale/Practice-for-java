package com.example.androidjavabasic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {


    private RecyclerView recyclerView;
    private EmployeeAdapter  adapter;

    private ArrayList<Employee> employees;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);/// recyclview bind by id
        recyclerView.setLayoutManager(new LinearLayoutManager(this));/// layout manager to specify vertical by default
        employees = new ArrayList<>(); /// arraylist specified here

        TestModelClass testModelClass = new TestModelClass(); /// model class declaire here
        testModelClass.setMyName("nehal");// value set to model class items
        testModelClass.setLastName("sonawale");


        adapter = new EmployeeAdapter( this,employees,testModelClass);// addapter with pass value to it

        recyclerView.setAdapter(adapter);// set adapter to recyclview
        createListData();/// simple medthod



        Employee employee = new Employee();
        employee.setName("Robert");
        employee.setAddress("New York");
        employee.setPhone("+61234456");
        employees.add(employee);

        employee = new Employee();
        employee.setName("Tom");
        employee.setAddress("California");
        employee.setEmail("tom_frank@gmail.com");
        employees.add(employee);

        employee = new Employee();
        employee.setName("Smith");
        employee.setAddress("Philadelphia");
        employee.setEmail("smith_carrol@gmail.com");
        employees.add(employee);

        employee = new Employee();
        employee.setName("Ryan");
        employee.setAddress("Canada");
        employee.setPhone("+612001456");
        employees.add(employee);

        employee = new Employee();
        employee.setName("Mark");
        employee.setAddress("Boston");
        employee.setEmail("mark_walmerd@gmail.com");
        employees.add(employee);

        employee = new Employee();
        employee.setName("Adam");
        employee.setAddress("Brooklyn");
        employee.setPhone("+61211780");
        employees.add(employee);

        employee = new Employee();
        employee.setName("Kevin");
        employee.setAddress("New Jersey");
        employee.setPhone("+94221035");
        employees.add(employee);

        Log.e("employ list value",""+employees);


        // set adapter


    }

    private void createListData(){

       // Employee employee = new Employee("Prashant","New York","+61234456","");
      //  employees.add(employee);

         //employee = new Employee("Sonawale","New York","+61234456","");

       // employees.add(employee);

    }
}
