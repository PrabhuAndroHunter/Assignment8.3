package com.assignment.data;

import android.graphics.Bitmap;

public class Item {
    Bitmap image;

    public Item(Bitmap image) {
        this.image = image;
    }

    public Bitmap getImage() {
        return image;
    }

    public void setImage(Bitmap image) {
        this.image = image;
    }

}
