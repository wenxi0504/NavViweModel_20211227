package com.example.navviewmodel_20211227;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel
{   // variable
    private MutableLiveData<Integer> number;

    //getNumber method
    public MutableLiveData<Integer> getNumber()
    {
        if (number==null)
        {
            MutableLiveData<Integer> number = new MutableLiveData<>();
            number.setValue(0);
        }
        return number;
    }

    // add method
    void add(int x)
    {
        number.setValue(number.getValue()+x);
        if (number.getValue()<0)
        {
            number.setValue(0);
        }

    }


}
