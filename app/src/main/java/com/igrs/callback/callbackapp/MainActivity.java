package com.igrs.callback.callbackapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.igrs.callback.abstractFactoryMode.MailSendFactory;
import com.igrs.callback.abstractFactoryMode.Provider;
import com.igrs.callback.abstractFactoryMode.Sender;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {
   private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView)findViewById(R.id.tv);
        Provider provider = new MailSendFactory();
        Sender sender = provider.produce();
        sender.send();
        JSONObject jsonObject = new JSONObject();
        JSONObject jsonObject1 = new JSONObject();
        JSONArray jsonArray = new JSONArray();


        try {
            jsonObject.put("name", "shitou");
            jsonObject.put("age",22);
            jsonObject.put("sex","boy");
            jsonArray.put(jsonObject);
            jsonObject1.put("per",jsonArray);
            Log.i("info","json----"+jsonObject1);
            Log.i("info","-----------------------------------------------------");
            JSONObject jsonObject2 = new JSONObject(jsonObject1.toString());
            JSONArray jsonArray1 = jsonObject2.getJSONArray("per");
            JSONObject jsonObject3 = (JSONObject)jsonArray1.get(0);
            Person person = new Person();
            person.setName(jsonObject3.getString("name"));
            person.setAge(jsonObject3.getInt("age"));
            person.setSex(jsonObject3.getString("sex"));
            Log.i("info",person.getName()+"-----"+person.getAge()+"--"+person.getSex());

        } catch (JSONException e) {
            e.printStackTrace();
        }


    }




}
