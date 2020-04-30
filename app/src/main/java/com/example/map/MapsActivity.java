package com.example.map;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng gasStation1 = new LatLng(-7.315591,112.2703743);
        mMap.addMarker(new MarkerOptions().position(gasStation1).title("SPBU Mini Pak Carek"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(gasStation1));

        LatLng gasStation2 = new LatLng(-7.291762,112.2164883);
        mMap.addMarker(new MarkerOptions().position(gasStation2).title("SPBU Ngimbang"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(gasStation2));

        LatLng gasStation3 = new LatLng(-7.3138947,112.2183886);
        mMap.addMarker(new MarkerOptions().position(gasStation3).title("SPBU Pabrik Gula"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(gasStation3));
    }
}
