package com.example.spacexdataretrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private SpaceXDataApi spaceXDataApi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView1);

        RetrofitInit();
        getDatas();

    }

    private void RetrofitInit(){

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.spacexdata.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        spaceXDataApi = retrofit.create(SpaceXDataApi.class);
    }

    private void getDatas(){
        Call<List<DataRepository>> call = spaceXDataApi.getDataRepository();


        call.enqueue(new Callback<List<DataRepository>>() {
            @Override
            public void onResponse(Call<List<DataRepository>> call, Response<List<DataRepository>> response) {
                if(!response.isSuccessful()){
                    textView.setText("Code : " +response.code());
                    return;}
               List<DataRepository> datas = response.body();
                for(DataRepository data : datas){
                    String content = "";

                    content += "flight_number : " + data.getFlightNumber() + "\n";
                    content += "mission_name : " + data.getMissionName() + "\n";
                    content += "mission_id : " + data.isUpcoming() + "\n";
                    content += "launch_year : " + data.getLaunchYear()+"\n";
                    content += "launch_date_unix : " + data.getLaunchDateUnix() + "\n";
                    content += "launch_date_local : " + data.getLaunchDateUTC() + "\n";
                    content += "is_tentative : " + data.isTentative() + "\n";
                    content += "tentative_max_precision" + data.getTentativeMaxPrecision() + "\n";
                    content += "tbd : " + data.isTbd() + "\n";
                    content += "launch_window : "+ data.getLaunchWindow() + "\n\n";

                    content += "\tROCKET\n";
                    content += "\trocket_id : " + data.rocket.getRocketId()+"\n";
                    content += "\trocket_name : " + data.rocket.getRocketName()+"\n";
                    content += "\trocket_type : " + data.rocket.getRocketType()+ "\n\n";

                    content += "\tLaunch Site\n";
                    content += "\tsite_id : " + data.launchSite.getSiteId()+"\n";
                    content += "\tsite_name : "+data.launchSite.getSiteName()+"\n";
                    content += "\tsite_name_long : " + data.launchSite.getSiteNameLong()+"\n";
                    content += "\tlaunch_success : " +data.launchSite.isLaunchSuccess()+"\n";

                    content += "\tLinks\n";
                    content += "\tmission_patch : " + data.links.getMissionPatch()+"\n";
                    content += "\tmission_patch_small : " + data.links.getMissionPatchSmall()+"\n";
                    content += "\treddit_campaign : " + data.links.getRedditCampaign()+"\n";
                    content += "\treddit_launch : " + data.links.getRedditLaunch()+"\n";
                    content += "\treddit_recovery : " + data.links.getRedditRecovery()+"\n";
                    content += "\treddit_media : " + data.links.getRedditMedia()+"\n";
                    content += "\tpresskit : " + data.links.getPresskit()+"\n";
                    content += "\tarticle_link : " + data.links.getArticleLink()+"\n";
                    content += "\twikipedia : " + data.links.getWikipedia()+"\n";
                    content += "\tvideo_link : " + data.links.getVideoLink()+"\n";
                    content += "\tyoutube_id : " + data.links.getYoutubeId()+"\n";

                    content += "\n\n\n";
                    textView.append(content);
                }
            }
            @Override
            public void onFailure(Call<List<DataRepository>> call, Throwable t) {
                textView.setText(t.getMessage());
            }
        });
    }



}