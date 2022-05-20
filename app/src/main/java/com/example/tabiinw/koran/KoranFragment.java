package com.example.tabiinw.koran;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;


public class KoranFragment extends Fragment {
    Document docKoranSurs;
    Document docKoranAyats;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        try {
            docKoranSurs = Jsoup.connect("https://falaq.ru/quran/arab/").get();


        }catch (IOException e){
            e.printStackTrace();
        }
        View view = inflater.inflate(R.layout.fragment_koran, container, false);
        return view;
        
    }
}