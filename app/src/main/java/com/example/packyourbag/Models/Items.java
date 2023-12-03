package com.example.packyourbag.Models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity(tableName = "items")
public class Items implements Serializable {

    @PrimaryKey(autoGenerate = true)
    int ID = 0;


    @ColumnInfo(name = "itemname")
    String itemname;

    @ColumnInfo(name = "category")
    String category;

    @ColumnInfo(name = "addedby")
    public
    String addedby;

    @ColumnInfo(name = "checked")
    public boolean checked = false;

    public Items(String itemname, String category, boolean checked) {

        this.addedby = "System";
        this.itemname = itemname;
        this.category = category;

        this.checked = checked;

    }

    public Items() {
        this.itemname = itemname;
        this.category = category;
        this.addedby = addedby;
        this.checked = checked;

    }


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAddedby(String userSmall) {
        return addedby;
    }

    public void setAddedby(String addedby) {
        this.addedby = addedby;
    }



    public Boolean getChecked(){
        return checked;
    }
    public void setChecked(boolean checked) {
        this.checked = checked;
    }



}