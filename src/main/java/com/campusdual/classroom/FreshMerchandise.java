package com.campusdual.classroom;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FreshMerchandise extends Merchandise {
     Date expirationDate;

    public FreshMerchandise(String name, String uniqueId, String responsibleId, int zone, String area, String shelf,
                             int quantity, Date expirationDate)
    {
        super(name, uniqueId, responsibleId, zone, area, shelf, quantity);
        this.expirationDate = expirationDate;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }


    public String getFormattedDate(Date date) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        return formatter.format(date);
    }


    @Override
    public String getSpecificData() {
        StringBuilder data = new StringBuilder();
        data.append("Localización: ").append(getLocation()).append("\n");
        data.append("Fecha de caducidad: ").append(getFormattedDate(this.expirationDate));
        return data.toString();
    }


    public void printSpecificData() {
        System.out.println(getSpecificData());
    }
}
