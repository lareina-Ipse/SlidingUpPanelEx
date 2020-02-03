package kr.co.chience.slidinguppanelex;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.sothree.slidinguppanel.SlidingUpPanelLayout;

import kr.co.chience.slidinguppanelex.adapter.ViewPagerAdapter;
import kr.co.chience.slidinguppanelex.fragment.HowFragment;
import kr.co.chience.slidinguppanelex.fragment.ResultFragment;
import kr.co.chience.slidinguppanelex.fragment.StartFragment;

public class MainActivity extends AppCompatActivity {

    SlidingUpPanelLayout layout;
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        toolbar = findViewById(R.id.myToolbar);
        tabLayout = findViewById(R.id.tablayout);
        viewPager = findViewById(R.id.myViewPager);

        layout = findViewById(R.id.slidingUp);
        layout.setAnchorPoint(0.4f);

        setSupportActionBar(toolbar);
        setupViewPager(viewPager);

        tabLayout.setupWithViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragment(new StartFragment(), "진단시작");
        viewPagerAdapter.addFragment(new HowFragment(), "호흡방법");
        viewPagerAdapter.addFragment(new ResultFragment(), "진단결과");
        viewPager.setAdapter(viewPagerAdapter);

    }

}
