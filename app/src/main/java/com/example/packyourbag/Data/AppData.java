package com.example.packyourbag.Data;

import android.app.Application;
import android.content.Context;
import android.widget.Toast;

import com.example.packyourbag.Database.RoomDB;
import com.example.packyourbag.Models.Items;
import com.example.packyourbag.constants.Myconstants;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppData extends Application {
    RoomDB database;
    String category;
    Context context;

    public static final String LAST_VERSION = " LAST_VERSION";
    public static final int NEW_VERSION = 1;

    public AppData(RoomDB database) {
        this.database = database;
    }

    public AppData(RoomDB database, Context context) {
        this.database = database;
        this.context = context;
    }

    public List<Items> getBasicData(){
        category= "Basic Needs";
        List<Items> basicItem = new ArrayList<>();
        basicItem.add(new Items("Visa",category,false));
        basicItem.add(new Items("Passport",category,false));
        basicItem.add(new Items("Tickets",category,false));
        basicItem.add(new Items("Wallet",category,false));
        basicItem.add(new Items("Driving License",category,false));
        basicItem.add(new Items("Currency",category,false));
        basicItem.add(new Items("House Key",category,false));
        basicItem.add(new Items("Book",category,false));
        basicItem.add(new Items("Travel Pillow",category,false));
        basicItem.add(new Items("Eye Patch",category,false));
        basicItem.add(new Items("Umbrella",category,false));
        basicItem.add(new Items("Note Book",category,false));
        return basicItem;
    }
    public List<Items> getPersonalCareData() {
        String[] data = {"Tooth_brush", "Floss", "Mouthwash", "Shaving Cream", "Razor Blade", "Soap", "Fiber",
                "Shampoo", "Hair Conditioner", "Brush", "Comb", "Hair Dryer", "Curling Iron", "Hair Moulder", "Hair Clip",
                "Moisturizer", "Makeup Remover", "Lip Cream", "Contact Lens", "Perfume", "Deodorant", "Makeup Material",
                "Wet Wipes", "Pad", "Ear Stick", "Cotton", "Nail Polish", "Nail Polish Remover", "Tweezers", "Nail Scissors",
                "Nail Files", "Suntan Cream"};
        return prepareItemsList(Myconstants.PERSONAL_CARE_CAMEL_CASE, data);
    }

    public List<Items> getClothingData() {
        String[] data = {"Stockings", "Underwear", "Pajamas", "T_Shirts", "Casual Dress", "Evening Dress", "Shirt",
                "Cardigan", "Vest", "Jacket", "Skirt", "Trousers", "Jeans", "Shorts", "Suit",
                "Coat", "Rain Coat", "Gloves", "Hat", "Scarf", "Bikini", "Belt",
                "Slippers", "Sneakers", "Casual Shoes", "Heeled Shoes", "Sport Wear"};
        return prepareItemsList(Myconstants.CLOTHING_CAMEL_CASE, data);
    }

    public List<Items> getBabyNeedData() {
        String[] data = {"SnapSuit", "OutFit", "JumpSuit", "Baby Socks", "Baby Hat", "Baby Pajamas", "Baby Bath Towel",
                "Muslin", "Blanket", "Dribble Bibs", "Baby Laundry Detergent", "Baby Bottles", "Baby Food Thermos",
                "Baby food Thermos", "Baby Bottle Brushes", "Brest_Feeding Cover", "Breast Pump",
                "Water Bottle", "Storage Container", "Baby Food Spoon", "High Chairs", "Diapers", "Wet Wipes",
                "Baby Cotton", "Baby Care Cover", "Baby Shampoo", "Baby soap", "Baby Nail Scissor", "Baby Moisturiser",
                "Potty", "Diaper Rash cream", "Serum Physiological", "Nasal Aspirator", "Fly Repellent Lotion", "Pyrometer",
                "Antipyretic Syrup", "Robotic Power", "Non Slip Sea Shoes", "Baby SunGlasses"};
        return prepareItemsList(Myconstants.BABY_NEEDS_CAMEL_CASE, data);
    }

    public List<Items> getHealthData() {
        String[] data = {"Stockings", "Underwear", "Pajamas", "T_Shirts", "Casual Dress", "Evening Dress", "Shirt",
                "Cardigan", "Vest", "Jacket", "Skirt", "Trousers", "Jeans", "Shorts", "Suit",
                "Coat", "Rain Coat", "Gloves", "Hat", "Scarf", "Bikini", "Belt",
                "Slippers", "Sneakers", "Casual Shoes", "Heeled Shoes", "Sport Wear"};
        return prepareItemsList(Myconstants.HEALTH_CAMEL_CASE, data);
    }

    public List<Items> getTechnologyData() {
        String[] data = {"MobilePhones", "Phone Covers", "E-Book Reader", "Camera", "Camera Charger", "Portable Speaker",
                "IPad(Tab)", "HeadPhone", "Laptop", "Laptop Charger", "Mouse", "Extension Cable", "Data Transfer Cable",
                "Battery", "Power Bank", "DVD Player", "Flash-Light", "MP3 Player", "Mp3 Player Charger", "Voltage Adapter",
                "SD Card"};
        return prepareItemsList(Myconstants.TECHNOLOGY_CAMEL_CASE, data);
    }

    public List<Items> getFoodData() {
        String[] data = {"Snack", "Sandwich", "Juice", "Tea Bags", "Coffee", "Water",
                "Thermos", "Chips", "Lays", "Baby Food"};
        return prepareItemsList(Myconstants.FOOD_CAMEL_CASE, data);
    }

    public List<Items> getBeachSuppliesData() {
        String[] data = {"Sea Glasses", "Sea Bed", "Suntan Cream", "Beach Umbrella", "Swim Fins", "Beach Bags",
                "Beach Towel", "Beach Slippers", "Sunbed", "Snorkel", "WaterProof Clock"};
        return prepareItemsList(Myconstants.BEACH_SUPPLIES_CAMEL_CASE, data);
    }

    public List<Items> getCarSuppliesData() {
        String[] data = {"Pump", "Car Jack", "Spare Car Key", "Accident Record set", "Auto Refrigerator", "Car Cover",
                "Car Charger", "Window Sun Shades"};
        return prepareItemsList(Myconstants.CAR_SUPPLIES_CAMEL_CASE, data);
    }

    public List<Items> getNeedsData() {
        String[] data = {"Back Pack", "Daily Bags", "Laundry Bags", "Sewing Kit", "Travel Lock", "Luggage Tag",
                "Magazine", "Sports Equipment", "Important Numbers"};
        return prepareItemsList(Myconstants.NEEDS_CAMEL_CASE, data);
    }
    public List<Items> prepareItemsList(String category,String[]data){
        List<String> list = Arrays.asList(data);
        List<Items> dataList = new ArrayList<>();
        dataList.clear();

        for(int i=0;i<list.size();i++){
            dataList.add(new Items(list.get(i),category,false));
        }
        return dataList;
    }

    public List<List<Items>> getAllData(){
        List<List<Items>> listOfAllItems = new ArrayList<>();
        listOfAllItems.clear();
        listOfAllItems.add(getBasicData());
        listOfAllItems.add(getClothingData());
        listOfAllItems.add(getPersonalCareData());
        listOfAllItems.add(getBabyNeedData());
        listOfAllItems.add(getHealthData());
        listOfAllItems.add(getTechnologyData());
        listOfAllItems.add(getFoodData());
        listOfAllItems.add(getBeachSuppliesData());
        listOfAllItems.add(getCarSuppliesData());
        listOfAllItems.add(getNeedsData());
        return listOfAllItems;

    }

    public void  persistAllData(){
        List<List<Items>> listOfAllItems = getAllData();
        for(List<Items> list : listOfAllItems){
            for(Items items:list){
                database.mainDao().saveItem(items);
            }
        }
        System.out.println("Data added.");
    }

    public void persistDataByCategory(String category, Boolean onlyDelete){
        try{
            List<Items> list = deleteAndGetListByCategory(category,onlyDelete);
            if (!onlyDelete){
                for(Items item:list){
                    database.mainDao().saveItem(item);
                }
                Toast.makeText(context, category+"Reset Successfully", Toast.LENGTH_SHORT).show();
            }else {
                Toast.makeText(context, category+"Reset Successfully", Toast.LENGTH_SHORT).show();
            }
        }catch(Exception ex){
            ex.printStackTrace();
            Toast.makeText(context, "Something went Wrong", Toast.LENGTH_SHORT).show();
        }
    }

    private List<Items> deleteAndGetListByCategory(String category,Boolean onlyDelete){
        if(onlyDelete){
            database.mainDao().deleteAllByCategoryAndAddedBy(category,Myconstants.SYSTEM_SMALL);
        }else{
            database.mainDao().deleteAllByCategory(category);
        }
        switch(category){
            case Myconstants.BASIC_NEEDS_CAMEL_CASE:
                return getBasicData();

            case Myconstants.CLOTHING_CAMEL_CASE:
                return getClothingData();

            case Myconstants.PERSONAL_CARE_CAMEL_CASE:
                return getPersonalCareData();

            case Myconstants.BABY_NEEDS_CAMEL_CASE:
                return getBabyNeedData();

            case Myconstants.HEALTH_CAMEL_CASE:
                return getHealthData();

            case Myconstants.TECHNOLOGY_CAMEL_CASE:
                return getTechnologyData();

            case Myconstants.FOOD_CAMEL_CASE:
                return getFoodData();

            case Myconstants.BEACH_SUPPLIES_CAMEL_CASE:
                return getBeachSuppliesData();

            case Myconstants.CAR_SUPPLIES_CAMEL_CASE:
                return getCarSuppliesData();

            case Myconstants.NEEDS_CAMEL_CASE:
                return getNeedsData();

            default:
                return new ArrayList<>();
        }
    }
}
