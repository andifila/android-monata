package kangoes.projek_monata;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Dashboard extends Activity implements View.OnClickListener {

    private CardView calender,events,personil,music;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        calender = (CardView) findViewById(R.id.calender);
        events = (CardView) findViewById(R.id.events);
        personil = (CardView) findViewById(R.id.personil);
        music = (CardView) findViewById(R.id.music);

        calender.setOnClickListener(this);
        events.setOnClickListener(this);
        personil.setOnClickListener(this);
        music.setOnClickListener(this);
    }

        public void onClick(View v){
            Intent i;

            switch (v.getId()){
                case R.id.calender : i = new Intent(this,Calender.class);startActivity(i); break;
                case R.id.events : i = new Intent(this,History.class);startActivity(i); break;
                case R.id.personil : i = new Intent(this,Personil.class);startActivity(i); break;
                case R.id.music : i = new Intent(this,Singer.class);startActivity(i); break;
                default:break;
            }
        }
}
