//1121
/*package com.example.hotspringtest2;


import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

public class HomePageHoliday extends AppCompatActivity {
    private int sss = 100;
    private int b2haha = 12*sss;
    private int y2haha = 24*sss;
    private int r2haha = 30*sss;
    private int time1 = 18*sss;
    private int time2 = 36*sss;
    public boolean peopleha3_1;
    public boolean peopleha3_2;
    public boolean peopleha3_3;
    public boolean peopleha3_4;
    public boolean peopleha3_5;

    public boolean peopleha3_7;
    public boolean peopleha3_66;

    private SharedPreferences sharedPreferenceshaha1;
    private SharedPreferences.Editor editorhaha1;
    private static final String TIMER_STARTED_KEYhaha1 = "timer_startedhaha1";
    private static final String START_TIME_KEYhaha1 = "start_timehaha1";
    private static final String ELAPSED_TIME_KEYhaha1 = "elapsed_timehaha1";

    private SharedPreferences sharedPreferenceshaha2;
    private SharedPreferences.Editor editorhaha2haha;
    private static final String TIMER_STARTED_KEy2haha = "timer_startedhaha2";
    private static final String START_TIME_KEy2haha = "start_timehaha2";
    private static final String ELAPSED_TIME_KEy2haha = "elapsed_timehaha2";

    private SharedPreferences sharedPreferenceshaha3;
    private SharedPreferences.Editor editorhaha3haha;
    private static final String TIMER_STARTED_KEy3haha = "timer_startedhaha3";
    private static final String START_TIME_KEy3haha = "start_timehaha3";
    private static final String ELAPSED_TIME_KEy3haha = "elapsed_timehaha3";

    private SharedPreferences sharedPreferenceshaha4;
    private SharedPreferences.Editor editorhaha4;
    private static final String TIMER_STARTED_KEYhaha4 = "timer_startedhaha4";
    private static final String START_TIME_KEYhaha4 = "start_timehaha4";
    private static final String ELAPSED_TIME_KEYhaha4 = "elapsed_timehaha4";
    private SharedPreferences sharedPreferenceshaha5;
    private SharedPreferences.Editor editorhaha5;
    private static final String TIMER_STARTED_KEYhaha5 = "timer_startedhaha5";
    private static final String START_TIME_KEYhaha5 = "start_timehaha5";
    private static final String ELAPSED_TIME_KEYhaha5 = "elapsed_timehaha5";



    private SharedPreferences sharedPreferenceshaha7;
    private SharedPreferences.Editor editorhaha7;
    private static final String TIMER_STARTED_KEYhaha7 = "timer_startedhaha7";
    private static final String START_TIME_KEYhaha7 = "start_timehaha7";
    private static final String ELAPSED_TIME_KEYhaha7 = "elapsed_timehaha7";

    private SharedPreferences sharedPreferenceshaha66;
    private SharedPreferences.Editor editorhaha66;
    private static final String TIMER_STARTED_KEYhaha66 = "timer_startedhaha66";
    private static final String START_TIME_KEYhaha66 = "start_timehaha66";
    private static final String ELAPSED_TIME_KEYhaha66 = "elapsed_timehaha66";



    private Handler handlerhaha1 = new Handler();
    private int originalblueThresholdhaha2 = b2haha;
    private int originalyellowThresholdhaha2 = y2haha;
    private int originalredThresholdhaha2 = r2haha;



    private long starttimeha1 = 0L;
    private long timeInMillisechaondshaha1 = 0L;
    private long updatedtimeha1 = 0L;
    private int sechaondsha1 = 0;
    private int secha1 = 0;
    private int minutesha1 = 0;
    private int hoursha1 = 0;
    private Button btnTimerha1;
    //此為測試用 正式版應改為正確時間
    private int blueThresholdha1 = b2haha;   //b2haha
    private int yellowThresholdha1 = y2haha; //y2haha
    private int redThresholdha1 = r2haha;    //r2haha
    //此為測試用 正式版應改為正確時間
    public int peopleha1;
    private boolean isTimerRunningha1 = false;



    private long starttimeha2 = 0L;
    private long timeInMillisechaondshaha2 = 0L;
    private long updatedtimeha2 = 0L;
    private int sechaondsha2 = 0;
    private int secha2 = 0;
    private int minutesha2 = 0;
    private int hoursha2 = 0;
    private Button btnTimerha2haha;
    private int blueThresholdha2 = b2haha;
    private int yellowThresholdha2 = y2haha;
    private int redThresholdha2 = r2haha;
    public int peopleha2;
    private boolean isTimerRunningha2 = false;


    private long startTimeha3 = 0L;
    private long timeInMillisechaondshaha3 = 0L;
    private long updatedTime3 = 0L;
    private int sechaondsha3 = 0;
    private int secha3 = 0;
    private int minutesha3 = 0;
    private int hoursha3 = 0;
    private Button btnTimerha3haha;
    private int blueThresholdha3 = b2haha;
    private int yellowThresholdha3 = y2haha;
    private int redThresholdha3 = r2haha;
    public int peopleha3;
    private boolean isTimerRunningha3 = false;


    private long startTimeha4 = 0L;
    private long timeInMillisechaondshaha4 = 0L;
    private long updatedTime4 = 0L;
    private int sechaondsha4 = 0;
    private int secha4 = 0;
    private int minutesha4 = 0;
    private int hoursha4 = 0;
    private Button btnTimerha4;
    private int blueThresholdha4 = b2haha;
    private int yellowThresholdha4 = y2haha;
    private int redThresholdha4 = r2haha;
    public int peopleha4;
    private boolean isTimerRunningha4 = false;

    private long startTimeha5 = 0L;
    private long timeInMillisechaondshaha5 = 0L;
    private long updatedTime5 = 0L;
    private int sechaondsha5 = 0;
    private int secha5 = 0;
    private int minutesha5 = 0;
    private int hoursha5 = 0;
    private Button btnTimerha5;
    private int blueThresholdha5 = b2haha;
    private int yellowThresholdha5 = y2haha;
    private int redThresholdha5 = r2haha;
    public int peopleha5;
    private boolean isTimerRunningha5 = false;


    private long startTimeha7 = 0L;
    private long timeInMillisechaondshaha7 = 0L;
    private long updatedTime7 = 0L;
    private int sechaondsha7 = 0;
    private int secha7 = 0;
    private int minutesha7 = 0;
    private int hoursha7 = 0;
    private Button btnTimerha7;
    private int blueThresholdha7 = b2haha;
    private int yellowThresholdha7 = y2haha;
    private int redThresholdha7 = r2haha;
    public int peopleha7;
    private boolean isTimerRunningha7 = false;


    private long startTimeha66 = 0L;
    private long timeInMillisechaondshaha66 = 0L;
    private long updatedTime66 = 0L;
    private int sechaondsha66 = 0;
    private int secha66 = 0;
    private int minutesha66 = 0;
    private int hoursha66 = 0;
    private Button btnTimerha66;
    private int blueThresholdha66 = b2haha;
    private int yellowThresholdha66 = y2haha;
    private int redThresholdha66 = r2haha;
    public int peopleha66;
    private boolean isTimerRunningha66 = false;


    private boolean flashingha1;
    private boolean flashingha2;
    private boolean flashingha3;
    private boolean flashingha4;
    private boolean flashingha5;
    private boolean flashingha7;
    private boolean flashingha66 ;


    private boolean flashinghag1;
    private boolean flashinghag2 ;
    private boolean flashinghag3 ;
    private boolean flashinghag4 ;
    private boolean flashinghag5 ;
    private boolean flashinghag7 ;
    private boolean flashinghag66 ;


    // 獲得現在的時間

    int currentHourha1;
    int currentMinuteha1;

    int currentHourha2haha;
    int currentMinuteha2;

    int currentHourha3haha;
    int currentMinuteha3;

    int currentHourha4;
    int currentMinuteha4;

    int currentHourha5;
    int currentMinuteha5;



    int currentHourha7;
    int currentMinuteha7;


    int currentHourha66;
    int currentMinuteha66;

    int futureHourha1;
    int futureMinuteha1;
    int futureHourha2haha;
    int futureMinuteha2;

    int futureHourha3haha;
    int futureMinuteha3;

    int futureHourha4;
    int futureMinuteha4;

    int futureHourha5;
    int futureMinuteha5;

    int futureHourha7;
    int futureMinuteha7;

    int futureHourha66;
    int futureMinuteha66;




    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page_holiday);



        // 啟動計時器服務
        Intent timerServiceIntenthaha = new Intent(this, TimerServiceS2.class);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            startForegroundService(timerServiceIntenthaha);
        } else {
            startService(timerServiceIntenthaha);
        }
        // 初始化 SharedPreferences 和 editorhaha1
        sharedPreferenceshaha1 = PreferenceManager.getDefaultSharedPreferences(this);
        editorhaha1 = sharedPreferenceshaha1.edit();

        // 初始化 SharedPreferences 和 editorhaha2haha
        sharedPreferenceshaha2 = PreferenceManager.getDefaultSharedPreferences(this);
        editorhaha2haha = sharedPreferenceshaha2.edit();
// 初始化 SharedPreferences 和 editorhaha3haha
        sharedPreferenceshaha3 = PreferenceManager.getDefaultSharedPreferences(this);
        editorhaha3haha = sharedPreferenceshaha3.edit();

// 初始化 SharedPreferences 和 editorhaha4
        sharedPreferenceshaha4 = PreferenceManager.getDefaultSharedPreferences(this);
        editorhaha4 = sharedPreferenceshaha4.edit();
        sharedPreferenceshaha5 = PreferenceManager.getDefaultSharedPreferences(this);
        editorhaha5 = sharedPreferenceshaha5.edit();



        sharedPreferenceshaha7 = PreferenceManager.getDefaultSharedPreferences(this);
        editorhaha7 = sharedPreferenceshaha7.edit();

        sharedPreferenceshaha8 = PreferenceManager.getDefaultSharedPreferences(this);
        editorhaha8 = sharedPreferenceshaha8.edit();

        sharedPreferenceshaha9 = PreferenceManager.getDefaultSharedPreferences(this);
        editorhaha9 = sharedPreferenceshaha9.edit();

        sharedPreferenceshaha10 = PreferenceManager.getDefaultSharedPreferences(this);
        editorhaha10 = sharedPreferenceshaha10.edit();

        sharedPreferenceshaha11 = PreferenceManager.getDefaultSharedPreferences(this);
        editorhaha11 = sharedPreferenceshaha11.edit();

        sharedPreferenceshaha12 = PreferenceManager.getDefaultSharedPreferences(this);
        editorhaha12 = sharedPreferenceshaha12.edit();

        sharedPreferenceshaha13 = PreferenceManager.getDefaultSharedPreferences(this);
        editorhaha13 = sharedPreferenceshaha13.edit();

        sharedPreferenceshaha14 = PreferenceManager.getDefaultSharedPreferences(this);
        editorhaha14 = sharedPreferenceshaha14.edit();

        sharedPreferenceshaha15 = PreferenceManager.getDefaultSharedPreferences(this);
        editorhaha15 = sharedPreferenceshaha15.edit();

        sharedPreferenceshaha16 = PreferenceManager.getDefaultSharedPreferences(this);
        editorhaha16 = sharedPreferenceshaha16.edit();

        sharedPreferenceshaha17 = PreferenceManager.getDefaultSharedPreferences(this);
        editorhaha17 = sharedPreferenceshaha17.edit();

        sharedPreferenceshaha18 = PreferenceManager.getDefaultSharedPreferences(this);
        editorhaha18 = sharedPreferenceshaha18.edit();

        sharedPreferenceshaha19 = PreferenceManager.getDefaultSharedPreferences(this);
        editorhaha19 = sharedPreferenceshaha19.edit();

        sharedPreferenceshaha20 = PreferenceManager.getDefaultSharedPreferences(this);
        editorhaha2haha0 = sharedPreferenceshaha20.edit();

        sharedPreferenceshaha21 = PreferenceManager.getDefaultSharedPreferences(this);
        editorhaha2haha1 = sharedPreferenceshaha21.edit();

        sharedPreferenceshaha22 = PreferenceManager.getDefaultSharedPreferences(this);
        editorhaha2haha2 = sharedPreferenceshaha22.edit();

        sharedPreferenceshaha23 = PreferenceManager.getDefaultSharedPreferences(this);
        editorhaha2haha3 = sharedPreferenceshaha23.edit();

        sharedPreferenceshaha24 = PreferenceManager.getDefaultSharedPreferences(this);
        editorhaha2haha4 = sharedPreferenceshaha24.edit();

        sharedPreferenceshaha25 = PreferenceManager.getDefaultSharedPreferences(this);
        editorhaha2haha5 = sharedPreferenceshaha25.edit();

        //sharedPreferenceshaha266 = PreferenceManager.getDefaultSharedPreferences(this);
        //editorhaha2haha6 = sharedPreferenceshaha266.edit();

        sharedPreferenceshaha27KK = PreferenceManager.getDefaultSharedPreferences(this);
        editorhaha2haha7KK = sharedPreferenceshaha27KK.edit();

        sharedPreferenceshaha28KK = PreferenceManager.getDefaultSharedPreferences(this);
        editorhaha2haha8KK = sharedPreferenceshaha28KK.edit();

        sharedPreferenceshaha66 = PreferenceManager.getDefaultSharedPreferences(this);
        editorhaha66 = sharedPreferenceshaha66.edit();

        sharedPreferenceshaha26KK = PreferenceManager.getDefaultSharedPreferences(this);
        editorhaha2haha6KK = sharedPreferenceshaha26KK.edit();



        btnTimerha1 = findViewById(R.id.b1);
        btnTimerha1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunningha1){
                    showConfirmationDialogForButton1();
                    //isTimerRunningha1 = true;
                    updateButtonColorha1(); // 更新颜色
                } else if (isTimerRunningha1) {
                    if (secha1 < blueThresholdha1) {
                        updateButtonColorha1();
                        showConfirmationDialogYNForButton1();
                    } else if (blueThresholdha1 <= secha1  && secha1 < yellowThresholdha1  ) {
                        if(!flashingha1){
                            flashingha1 = true; // 停止蓝色闪烁
                            updateButtonColorha1();
                        } else if (flashingha1) {
                            updateButtonColorha1();
                            showConfirmationDialogYNForButton1();
                        }

                    } else if (yellowThresholdha1 <= secha1  && secha1 < redThresholdha1) {
                        if(!flashinghag1){
                            flashinghag1 = true; // 停止黄色闪烁
                            updateButtonColorha1();
                        } else if (flashinghag1) {
                            updateButtonColorha1();
                            showConfirmationDialogYNForButton1();
                        }

                    } else if (secha1 >= redThresholdha1) {
                        updateButtonColorha1();
                        showConfirmationDialogYNForButton1();
                    }
                }
            }
        });

        btnTimerha1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton1();
                return true;
            }
        });

        btnTimerha2haha = findViewById(R.id.b2);
        btnTimerha2haha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunningha2){
                    showConfirmationDialogForButton2();
                    //isTimerRunningha2 = true;
                    updateButtonColorha2haha(); // 更新颜色
                } else if (isTimerRunningha2) {
                    if (secha2 < blueThresholdha2) {
                        updateButtonColorha2haha();
                        showConfirmationDialogYNForButton2();
                    } else if (blueThresholdha2 <= secha2  && secha2 < yellowThresholdha2  ) {
                        if(!flashingha2){
                            flashingha2 = true; // 停止蓝色闪烁
                            updateButtonColorha2haha();
                        } else if (flashingha2) {
                            updateButtonColorha2haha();
                            showConfirmationDialogYNForButton2();
                        }

                    } else if (yellowThresholdha2 <= secha2  && secha2 < redThresholdha2) {
                        if(!flashinghag2){
                            flashinghag2 = true; // 停止黄色闪烁
                            updateButtonColorha2haha();
                        } else if (flashinghag2) {
                            updateButtonColorha2haha();
                            showConfirmationDialogYNForButton2();
                        }

                    } else if (secha2 >= redThresholdha2) {
                        updateButtonColorha2haha();
                        showConfirmationDialogYNForButton2();
                    }
                }
            }
        });

        btnTimerha2haha.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton2();
                return true;
            }
        });


        btnTimerha3haha = findViewById(R.id.b3);
        btnTimerha3haha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunningha3){
                    showConfirmationDialogForButton3();
                    //isTimerRunningha3 = true;
                    updateButtonColorha3haha(); // 更新颜色
                } else if (isTimerRunningha3) {
                    if (secha3 < blueThresholdha3) {
                        updateButtonColorha3haha();
                        showConfirmationDialogYNForButton3();
                    } else if (blueThresholdha3 <= secha3  && secha3 < yellowThresholdha3  ) {
                        if(!flashingha3){
                            flashingha3 = true; // 停止蓝色闪烁
                            updateButtonColorha3haha();
                        } else if (flashingha3) {
                            updateButtonColorha3haha();
                            showConfirmationDialogYNForButton3();
                        }

                    } else if (yellowThresholdha3 <= secha3  && secha3 < redThresholdha3) {
                        if(!flashinghag3){
                            flashinghag3 = true; // 停止黄色闪烁
                            updateButtonColorha3haha();
                        } else if (flashinghag3) {
                            updateButtonColorha3haha();
                            showConfirmationDialogYNForButton3();
                        }

                    } else if (secha3 >= redThresholdha3) {
                        updateButtonColorha3haha();
                        showConfirmationDialogYNForButton3();
                    }
                }
            }
        });

        btnTimerha3haha.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton3();
                return true;
            }
        });

        btnTimerha4 = findViewById(R.id.b4);
        btnTimerha4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunningha4){
                    showConfirmationDialogForButton4();
                    //isTimerRunningha4 = true;
                    updateButtonColorha4(); // 更新颜色
                } else if (isTimerRunningha4) {
                    if (secha4 < blueThresholdha4) {
                        updateButtonColorha4();
                        showConfirmationDialogYNForButton4();
                    } else if (blueThresholdha4 <= secha4  && secha4 < yellowThresholdha4  ) {
                        if(!flashingha4){
                            flashingha4 = true; // 停止蓝色闪烁
                            updateButtonColorha4();
                        } else if (flashingha4) {
                            updateButtonColorha4();
                            showConfirmationDialogYNForButton4();
                        }

                    } else if (yellowThresholdha4 <= secha4  && secha4 < redThresholdha4) {
                        if(!flashinghag4){
                            flashinghag4 = true; // 停止黄色闪烁
                            updateButtonColorha4();
                        } else if (flashinghag4) {
                            updateButtonColorha4();
                            showConfirmationDialogYNForButton4();
                        }

                    } else if (secha4 >= redThresholdha4) {
                        updateButtonColorha4();
                        showConfirmationDialogYNForButton4();
                    }
                }
            }
        });

        btnTimerha4.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton4();
                return true;
            }
        });

        btnTimerha5 = findViewById(R.id.b5);
        btnTimerha5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunningha5){
                    showConfirmationDialogForButton5();
                    //isTimerRunningha5 = true;
                    updateButtonColorha5(); // 更新颜色
                } else if (isTimerRunningha5) {
                    if (secha5 < blueThresholdha5) {
                        updateButtonColorha5();
                        showConfirmationDialogYNForButton5();
                    } else if (blueThresholdha5 <= secha5  && secha5 < yellowThresholdha5  ) {
                        if(!flashingha5){
                            flashingha5 = true; // 停止蓝色闪烁
                            updateButtonColorha5();
                        } else if (flashingha5) {
                            updateButtonColorha5();
                            showConfirmationDialogYNForButton5();
                        }

                    } else if (yellowThresholdha5 <= secha5  && secha5 < redThresholdha5) {
                        if(!flashinghag5){
                            flashinghag5 = true; // 停止黄色闪烁
                            updateButtonColorha5();
                        } else if (flashinghag5) {
                            updateButtonColorha5();
                            showConfirmationDialogYNForButton5();
                        }

                    } else if (secha5 >= redThresholdha5) {
                        updateButtonColorha5();
                        showConfirmationDialogYNForButton5();
                    }
                }
            }
        });

        btnTimerha5.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton5();
                return true;
            }
        });





        btnTimerha7 = findViewById(R.id.b7);
        btnTimerha7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunningha7){
                    showConfirmationDialogForButton7();
                    //isTimerRunningha7 = true;
                    updateButtonColorha7(); // 更新颜色
                } else if (isTimerRunningha7) {
                    if (secha7 < blueThresholdha7) {
                        updateButtonColorha7();
                        showConfirmationDialogYNForButton7();
                    } else if (blueThresholdha7 <= secha7  && secha7 < yellowThresholdha7  ) {
                        if(!flashingha7){
                            flashingha7 = true; // 停止蓝色闪烁
                            updateButtonColorha7();
                        } else if (flashingha7) {
                            updateButtonColorha7();
                            showConfirmationDialogYNForButton7();
                        }

                    } else if (yellowThresholdha7 <= secha7  && secha7 < redThresholdha7) {
                        if(!flashinghag7){
                            flashinghag7 = true; // 停止黄色闪烁
                            updateButtonColorha7();
                        } else if (flashinghag7) {
                            updateButtonColorha7();
                            showConfirmationDialogYNForButton7();
                        }

                    } else if (secha7 >= redThresholdha7) {
                        updateButtonColorha7();
                        showConfirmationDialogYNForButton7();
                    }
                }
            }
        });

        btnTimerha7.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton7();
                return true;
            }
        });

        btnTimerha8 = findViewById(R.id.b8);
        btnTimerha8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunningha8){
                    showConfirmationDialogForButton8();
                    //isTimerRunningha8 = true;
                    updateButtonColorha8(); // 更新颜色
                } else if (isTimerRunningha8) {
                    if (secha8 < blueThresholdha8) {
                        updateButtonColorha8();
                        showConfirmationDialogYNForButton8();
                    } else if (blueThresholdha8 <= secha8  && secha8 < yellowThresholdha8  ) {
                        if(!flashingha8){
                            flashingha8 = true; // 停止蓝色闪烁
                            updateButtonColorha8();
                        } else if (flashingha8) {
                            updateButtonColorha8();
                            showConfirmationDialogYNForButton8();
                        }

                    } else if (yellowThresholdha8 <= secha8  && secha8 < redThresholdha8) {
                        if(!flashinghag8){
                            flashinghag8 = true; // 停止黄色闪烁
                            updateButtonColorha8();
                        } else if (flashinghag8) {
                            updateButtonColorha8();
                            showConfirmationDialogYNForButton8();
                        }

                    } else if (secha8 >= redThresholdha8) {
                        updateButtonColorha8();
                        showConfirmationDialogYNForButton8();
                    }
                }
            }
        });

        btnTimerha8.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton8();
                return true;
            }
        });

        btnTimerha9 = findViewById(R.id.b9);
        btnTimerha9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunningha9){
                    showConfirmationDialogForButton9();
                    //isTimerRunningha9 = true;
                    updateButtonColorha9(); // 更新颜色
                } else if (isTimerRunningha9) {
                    if (secha9 < blueThresholdha9) {
                        updateButtonColorha9();
                        showConfirmationDialogYNForButton9();
                    } else if (blueThresholdha9 <= secha9  && secha9 < yellowThresholdha9  ) {
                        if(!flashingha9){
                            flashingha9 = true; // 停止蓝色闪烁
                            updateButtonColorha9();
                        } else if (flashingha9) {
                            updateButtonColorha9();
                            showConfirmationDialogYNForButton9();
                        }

                    } else if (yellowThresholdha9 <= secha9  && secha9 < redThresholdha9) {
                        if(!flashinghag9){
                            flashinghag9 = true; // 停止黄色闪烁
                            updateButtonColorha9();
                        } else if (flashinghag9) {
                            updateButtonColorha9();
                            showConfirmationDialogYNForButton9();
                        }

                    } else if (secha9 >= redThresholdha9) {
                        updateButtonColorha9();
                        showConfirmationDialogYNForButton9();
                    }
                }
            }
        });

        btnTimerha9.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton9();
                return true;
            }
        });

        btnTimerha10 = findViewById(R.id.b10);
        btnTimerha10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunningha10){
                    showConfirmationDialogForButton10();
                    //isTimerRunningha10 = true;
                    updateButtonColorha10(); // 更新颜色
                } else if (isTimerRunningha10) {
                    if (secha10 < blueThresholdha10) {
                        updateButtonColorha10();
                        showConfirmationDialogYNForButton10();
                    } else if (blueThresholdha10 <= secha10  && secha10 < yellowThresholdha10  ) {
                        if(!flashingha10){
                            flashingha10 = true; // 停止蓝色闪烁
                            updateButtonColorha10();
                        } else if (flashingha10) {
                            updateButtonColorha10();
                            showConfirmationDialogYNForButton10();
                        }

                    } else if (yellowThresholdha10 <= secha10  && secha10 < redThresholdha10) {
                        if(!flashinghag10){
                            flashinghag10 = true; // 停止黄色闪烁
                            updateButtonColorha10();
                        } else if (flashinghag10) {
                            updateButtonColorha10();
                            showConfirmationDialogYNForButton10();
                        }

                    } else if (secha10 >= redThresholdha10) {
                        updateButtonColorha10();
                        showConfirmationDialogYNForButton10();
                    }
                }
            }
        });

        btnTimerha10.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton10();
                return true;
            }
        });

        btnTimerha11 = findViewById(R.id.b11);
        btnTimerha11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunningha11){
                    showConfirmationDialogForButton11();
                    //isTimerRunningha11 = true;
                    updateButtonColorha11(); // 更新颜色
                } else if (isTimerRunningha11) {
                    if (secha11 < blueThresholdha11) {
                        updateButtonColorha11();
                        showConfirmationDialogYNForButton11();
                    } else if (blueThresholdha11 <= secha11  && secha11 < yellowThresholdha11  ) {
                        if(!flashingha11){
                            flashingha11 = true; // 停止蓝色闪烁
                            updateButtonColorha11();
                        } else if (flashingha11) {
                            updateButtonColorha11();
                            showConfirmationDialogYNForButton11();
                        }

                    } else if (yellowThresholdha11 <= secha11  && secha11 < redThresholdha11) {
                        if(!flashinghag11){
                            flashinghag11 = true; // 停止黄色闪烁
                            updateButtonColorha11();
                        } else if (flashinghag11) {
                            updateButtonColorha11();
                            showConfirmationDialogYNForButton11();
                        }

                    } else if (secha11 >= redThresholdha11) {
                        updateButtonColorha11();
                        showConfirmationDialogYNForButton11();
                    }
                }
            }
        });

        btnTimerha11.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton11();
                return true;
            }
        });


        btnTimerha16 = findViewById(R.id.b16);
        btnTimerha16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunningha16){
                    showConfirmationDialogForButton16();
                    //isTimerRunningha16 = true;
                    updateButtonColorha16(); // 更新颜色
                } else if (isTimerRunningha16) {
                    if (secha16 < blueThresholdha16) {
                        updateButtonColorha16();
                        showConfirmationDialogYNForButton16();
                    } else if (blueThresholdha16 <= secha16  && secha16 < yellowThresholdha16  ) {
                        if(!flashingha16){
                            flashingha16 = true; // 停止蓝色闪烁
                            updateButtonColorha16();
                        } else if (flashingha16) {
                            updateButtonColorha16();
                            showConfirmationDialogYNForButton16();
                        }

                    } else if (yellowThresholdha16 <= secha16  && secha16 < redThresholdha16) {
                        if(!flashinghag16){
                            flashinghag16 = true; // 停止黄色闪烁
                            updateButtonColorha16();
                        } else if (flashinghag16) {
                            updateButtonColorha16();
                            showConfirmationDialogYNForButton16();
                        }

                    } else if (secha16 >= redThresholdha16) {
                        updateButtonColorha16();
                        showConfirmationDialogYNForButton16();
                    }
                }
            }
        });

        btnTimerha16.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton16();
                return true;
            }
        });


        btnTimerha17 = findViewById(R.id.b17);
        btnTimerha17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunningha17){
                    showConfirmationDialogForButton17();
                    //isTimerRunningha17 = true;
                    updateButtonColorha17(); // 更新颜色
                } else if (isTimerRunningha17) {
                    if (secha17 < blueThresholdha17) {
                        updateButtonColorha17();
                        showConfirmationDialogYNForButton17();
                    } else if (blueThresholdha17 <= secha17  && secha17 < yellowThresholdha17  ) {
                        if(!flashingha17){
                            flashingha17 = true; // 停止蓝色闪烁
                            updateButtonColorha17();
                        } else if (flashingha17) {
                            updateButtonColorha17();
                            showConfirmationDialogYNForButton17();
                        }

                    } else if (yellowThresholdha17 <= secha17  && secha17 < redThresholdha17) {
                        if(!flashinghag17){
                            flashinghag17 = true; // 停止黄色闪烁
                            updateButtonColorha17();
                        } else if (flashinghag17) {
                            updateButtonColorha17();
                            showConfirmationDialogYNForButton17();
                        }

                    } else if (secha17 >= redThresholdha17) {
                        updateButtonColorha17();
                        showConfirmationDialogYNForButton17();
                    }
                }
            }
        });

        btnTimerha17.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton17();
                return true;
            }
        });

        btnTimerha18 = findViewById(R.id.b18);
        btnTimerha18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunningha18){
                    showConfirmationDialogForButton18();
                    //isTimerRunningha18 = true;
                    updateButtonColorha18(); // 更新颜色
                } else if (isTimerRunningha18) {
                    if (secha18 < blueThresholdha18) {
                        updateButtonColorha18();
                        showConfirmationDialogYNForButton18();
                    } else if (blueThresholdha18 <= secha18  && secha18 < yellowThresholdha18  ) {
                        if(!flashingha18){
                            flashingha18 = true; // 停止蓝色闪烁
                            updateButtonColorha18();
                        } else if (flashingha18) {
                            updateButtonColorha18();
                            showConfirmationDialogYNForButton18();
                        }

                    } else if (yellowThresholdha18 <= secha18  && secha18 < redThresholdha18) {
                        if(!flashinghag18){
                            flashinghag18 = true; // 停止黄色闪烁
                            updateButtonColorha18();
                        } else if (flashinghag18) {
                            updateButtonColorha18();
                            showConfirmationDialogYNForButton18();
                        }

                    } else if (secha18 >= redThresholdha18) {
                        updateButtonColorha18();
                        showConfirmationDialogYNForButton18();
                    }
                }
            }
        });

        btnTimerha18.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton18();
                return true;
            }
        });

        btnTimerha19 = findViewById(R.id.b19);
        btnTimerha19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunningha19){
                    showConfirmationDialogForButton19();
                    //isTimerRunningha19 = true;
                    updateButtonColorha19(); // 更新颜色
                } else if (isTimerRunningha19) {
                    if (secha19 < blueThresholdha19) {
                        updateButtonColorha19();
                        showConfirmationDialogYNForButton19();
                    } else if (blueThresholdha19 <= secha19  && secha19 < yellowThresholdha19  ) {
                        if(!flashingha19){
                            flashingha19 = true; // 停止蓝色闪烁
                            updateButtonColorha19();
                        } else if (flashingha19) {
                            updateButtonColorha19();
                            showConfirmationDialogYNForButton19();
                        }

                    } else if (yellowThresholdha19 <= secha19  && secha19 < redThresholdha19) {
                        if(!flashinghag19){
                            flashinghag19 = true; // 停止黄色闪烁
                            updateButtonColorha19();
                        } else if (flashinghag19) {
                            updateButtonColorha19();
                            showConfirmationDialogYNForButton19();
                        }

                    } else if (secha19 >= redThresholdha19) {
                        updateButtonColorha19();
                        showConfirmationDialogYNForButton19();
                    }
                }
            }
        });

        btnTimerha19.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton19();
                return true;
            }
        });

        btnTimerha2haha0 = findViewById(R.id.b20);
        btnTimerha2haha0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunningha20){
                    showConfirmationDialogForButton20();
                    //isTimerRunningha20 = true;
                    updateButtonColorha2haha0(); // 更新颜色
                } else if (isTimerRunningha20) {
                    if (secha20 < blueThresholdha20) {
                        updateButtonColorha2haha0();
                        showConfirmationDialogYNForButton20();
                    } else if (blueThresholdha20 <= secha20  && secha20 < yellowThresholdha20  ) {
                        if(!flashingha20){
                            flashingha20 = true; // 停止蓝色闪烁
                            updateButtonColorha2haha0();
                        } else if (flashingha20) {
                            updateButtonColorha2haha0();
                            showConfirmationDialogYNForButton20();
                        }

                    } else if (yellowThresholdha20 <= secha20  && secha20 < redThresholdha20) {
                        if(!flashinghag20){
                            flashinghag20 = true; // 停止黄色闪烁
                            updateButtonColorha2haha0();
                        } else if (flashinghag20) {
                            updateButtonColorha2haha0();
                            showConfirmationDialogYNForButton20();
                        }

                    } else if (secha20 >= redThresholdha20) {
                        updateButtonColorha2haha0();
                        showConfirmationDialogYNForButton20();
                    }
                }
            }
        });

        btnTimerha2haha0.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton20();
                return true;
            }
        });

        btnTimerha2haha1 = findViewById(R.id.b21);
        btnTimerha2haha1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunningha21){
                    showConfirmationDialogForButton21();
                    //isTimerRunningha21 = true;
                    updateButtonColorha2haha1(); // 更新颜色
                } else if (isTimerRunningha21) {
                    if (secha21 < blueThresholdha21) {
                        updateButtonColorha2haha1();
                        showConfirmationDialogYNForButton21();
                    } else if (blueThresholdha21 <= secha21  && secha21 < yellowThresholdha21  ) {
                        if(!flashingha21){
                            flashingha21 = true; // 停止蓝色闪烁
                            updateButtonColorha2haha1();
                        } else if (flashingha21) {
                            updateButtonColorha2haha1();
                            showConfirmationDialogYNForButton21();
                        }

                    } else if (yellowThresholdha21 <= secha21  && secha21 < redThresholdha21) {
                        if(!flashinghag21){
                            flashinghag21 = true; // 停止黄色闪烁
                            updateButtonColorha2haha1();
                        } else if (flashinghag21) {
                            updateButtonColorha2haha1();
                            showConfirmationDialogYNForButton21();
                        }

                    } else if (secha21 >= redThresholdha21) {
                        updateButtonColorha2haha1();
                        showConfirmationDialogYNForButton21();
                    }
                }
            }
        });

        btnTimerha2haha1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton21();
                return true;
            }
        });

        btnTimerha2haha2 = findViewById(R.id.b22);
        btnTimerha2haha2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunningha22){
                    showConfirmationDialogForButton22();
                    //isTimerRunningha22 = true;
                    updateButtonColorha2haha2(); // 更新颜色
                } else if (isTimerRunningha22) {
                    if (secha22 < blueThresholdha22) {
                        updateButtonColorha2haha2();
                        showConfirmationDialogYNForButton22();
                    } else if (blueThresholdha22 <= secha22  && secha22 < yellowThresholdha22  ) {
                        if(!flashingha22){
                            flashingha22 = true; // 停止蓝色闪烁
                            updateButtonColorha2haha2();
                        } else if (flashingha22) {
                            updateButtonColorha2haha2();
                            showConfirmationDialogYNForButton22();
                        }

                    } else if (yellowThresholdha22 <= secha22  && secha22 < redThresholdha22) {
                        if(!flashinghag22){
                            flashinghag22 = true; // 停止黄色闪烁
                            updateButtonColorha2haha2();
                        } else if (flashinghag22) {
                            updateButtonColorha2haha2();
                            showConfirmationDialogYNForButton22();
                        }

                    } else if (secha22 >= redThresholdha22) {
                        updateButtonColorha2haha2();
                        showConfirmationDialogYNForButton22();
                    }
                }
            }
        });

        btnTimerha2haha2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton22();
                return true;
            }
        });

        btnTimerha2haha3 = findViewById(R.id.b23);
        btnTimerha2haha3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunningha23){
                    showConfirmationDialogForButton23();
                    //isTimerRunningha23 = true;
                    updateButtonColorha2haha3(); // 更新颜色
                } else if (isTimerRunningha23) {
                    if (secha23 < blueThresholdha23) {
                        updateButtonColorha2haha3();
                        showConfirmationDialogYNForButton23();
                    } else if (blueThresholdha23 <= secha23  && secha23 < yellowThresholdha23  ) {
                        if(!flashingha23){
                            flashingha23 = true; // 停止蓝色闪烁
                            updateButtonColorha2haha3();
                        } else if (flashingha23) {
                            updateButtonColorha2haha3();
                            showConfirmationDialogYNForButton23();
                        }

                    } else if (yellowThresholdha23 <= secha23  && secha23 < redThresholdha23) {
                        if(!flashinghag23){
                            flashinghag23 = true; // 停止黄色闪烁
                            updateButtonColorha2haha3();
                        } else if (flashinghag23) {
                            updateButtonColorha2haha3();
                            showConfirmationDialogYNForButton23();
                        }

                    } else if (secha23 >= redThresholdha23) {
                        updateButtonColorha2haha3();
                        showConfirmationDialogYNForButton23();
                    }
                }
            }
        });

        btnTimerha2haha3.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton23();
                return true;
            }
        });

        btnTimerha2haha4 = findViewById(R.id.b24);
        btnTimerha2haha4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunningha24){
                    showConfirmationDialogForButton24();
                    //isTimerRunningha24 = true;
                    updateButtonColorha2haha4(); // 更新颜色
                } else if (isTimerRunningha24) {
                    if (secha24 < blueThresholdha24) {
                        updateButtonColorha2haha4();
                        showConfirmationDialogYNForButton24();
                    } else if (blueThresholdha24 <= secha24  && secha24 < yellowThresholdha24  ) {
                        if(!flashingha24){
                            flashingha24 = true; // 停止蓝色闪烁
                            updateButtonColorha2haha4();
                        } else if (flashingha24) {
                            updateButtonColorha2haha4();
                            showConfirmationDialogYNForButton24();
                        }

                    } else if (yellowThresholdha24 <= secha24  && secha24 < redThresholdha24) {
                        if(!flashinghag24){
                            flashinghag24 = true; // 停止黄色闪烁
                            updateButtonColorha2haha4();
                        } else if (flashinghag24) {
                            updateButtonColorha2haha4();
                            showConfirmationDialogYNForButton24();
                        }

                    } else if (secha24 >= redThresholdha24) {
                        updateButtonColorha2haha4();
                        showConfirmationDialogYNForButton24();
                    }
                }
            }
        });

        btnTimerha2haha4.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton24();
                return true;
            }
        });

        btnTimerha2haha5 = findViewById(R.id.b25);
        btnTimerha2haha5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunningha25){
                    showConfirmationDialogForButton25();
                    //isTimerRunningha25 = true;
                    updateButtonColorha2haha5(); // 更新颜色
                } else if (isTimerRunningha25) {
                    if (secha25 < blueThresholdha25) {
                        updateButtonColorha2haha5();
                        showConfirmationDialogYNForButton25();
                    } else if (blueThresholdha25 <= secha25  && secha25 < yellowThresholdha25  ) {
                        if(!flashingha25){
                            flashingha25 = true; // 停止蓝色闪烁
                            updateButtonColorha2haha5();
                        } else if (flashingha25) {
                            updateButtonColorha2haha5();
                            showConfirmationDialogYNForButton25();
                        }

                    } else if (yellowThresholdha25 <= secha25  && secha25 < redThresholdha25) {
                        if(!flashinghag25){
                            flashinghag25 = true; // 停止黄色闪烁
                            updateButtonColorha2haha5();
                        } else if (flashinghag25) {
                            updateButtonColorha2haha5();
                            showConfirmationDialogYNForButton25();
                        }

                    } else if (secha25 >= redThresholdha25) {
                        updateButtonColorha2haha5();
                        showConfirmationDialogYNForButton25();
                    }
                }
            }
        });

        btnTimerha2haha5.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton25();
                return true;
            }
        });

        btnTimerha2haha7KK = findViewById(R.id.b27KK);
        btnTimerha2haha7KK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunningha27KK){
                    showConfirmationDialogForButton27KK();
                    //isTimerRunningha27KK = true;
                    updateButtonColorha2haha7KK(); // 更新颜色
                } else if (isTimerRunningha27KK) {
                    if (secha27KK < blueThresholdha27KK) {
                        updateButtonColorha2haha7KK();
                        showConfirmationDialogYNForButton27KK();
                    } else if (blueThresholdha27KK <= secha27KK  && secha27KK < yellowThresholdha27KK  ) {
                        if(!flashingha27KK){
                            flashingha27KK = true; // 停止蓝色闪烁
                            updateButtonColorha2haha7KK();
                        } else if (flashingha27KK) {
                            updateButtonColorha2haha7KK();
                            showConfirmationDialogYNForButton27KK();
                        }

                    } else if (yellowThresholdha27KK <= secha27KK  && secha27KK < redThresholdha27KK) {
                        if(!flashinghag27KK){
                            flashinghag27KK = true; // 停止黄色闪烁
                            updateButtonColorha2haha7KK();
                        } else if (flashinghag27KK) {
                            updateButtonColorha2haha7KK();
                            showConfirmationDialogYNForButton27KK();
                        }

                    } else if (secha27KK >= redThresholdha27KK) {
                        updateButtonColorha2haha7KK();
                        showConfirmationDialogYNForButton27KK();
                    }
                }
            }
        });

        btnTimerha2haha7KK.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton27KK();
                return true;
            }
        });

        btnTimerha2haha8KK = findViewById(R.id.b28KK);
        btnTimerha2haha8KK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunningha28KK){
                    showConfirmationDialogForButton28KK();
                    //isTimerRunningha28KK = true;
                    updateButtonColorha2haha8KK(); // 更新颜色
                } else if (isTimerRunningha28KK) {
                    if (secha28KK < blueThresholdha28KK) {
                        updateButtonColorha2haha8KK();
                        showConfirmationDialogYNForButton28KK();
                    } else if (blueThresholdha28KK <= secha28KK  && secha28KK < yellowThresholdha28KK  ) {
                        if(!flashingha28KK){
                            flashingha28KK = true; // 停止蓝色闪烁
                            updateButtonColorha2haha8KK();
                        } else if (flashingha28KK) {
                            updateButtonColorha2haha8KK();
                            showConfirmationDialogYNForButton28KK();
                        }

                    } else if (yellowThresholdha28KK <= secha28KK  && secha28KK < redThresholdha28KK) {
                        if(!flashinghag28KK){
                            flashinghag28KK = true; // 停止黄色闪烁
                            updateButtonColorha2haha8KK();
                        } else if (flashinghag28KK) {
                            updateButtonColorha2haha8KK();
                            showConfirmationDialogYNForButton28KK();
                        }

                    } else if (secha28KK >= redThresholdha28KK) {
                        updateButtonColorha2haha8KK();
                        showConfirmationDialogYNForButton28KK();
                    }
                }
            }
        });

        btnTimerha2haha8KK.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton28KK();
                return true;
            }
        });

        btnTimerha66 = findViewById(R.id.b666);
        btnTimerha66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunningha66){
                    showConfirmationDialogForButton66();
                    //isTimerRunningha66 = true;
                    updateButtonColorha66(); // 更新颜色
                } else if (isTimerRunningha66) {
                    if (secha66 < blueThresholdha66) {
                        updateButtonColorha66();
                        showConfirmationDialogYNForButton66();
                    } else if (blueThresholdha66 <= secha66  && secha66 < yellowThresholdha66  ) {
                        if(!flashingha66){
                            flashingha66 = true; // 停止蓝色闪烁
                            updateButtonColorha66();
                        } else if (flashingha66) {
                            updateButtonColorha66();
                            showConfirmationDialogYNForButton66();
                        }

                    } else if (yellowThresholdha66 <= secha66  && secha66 < redThresholdha66) {
                        if(!flashinghag66){
                            flashinghag66 = true; // 停止黄色闪烁
                            updateButtonColorha66();
                        } else if (flashinghag66) {
                            updateButtonColorha66();
                            showConfirmationDialogYNForButton66();
                        }

                    } else if (secha66 >= redThresholdha66) {
                        updateButtonColorha66();
                        showConfirmationDialogYNForButton66();
                    }
                }
            }
        });

        btnTimerha66.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton66();
                return true;
            }
        });
        btnTimerha2haha01 = findViewById(R.id.b201);
        btnTimerha2haha01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunningha201){
                    showConfirmationDialogForButton201();
                    //isTimerRunningha201 = true;
                    updateButtonColorha2haha01(); // 更新颜色
                } else if (isTimerRunningha201) {
                    if (secha201 < blueThresholdha201) {
                        updateButtonColorha2haha01();
                        showConfirmationDialogYNForButton201();
                    } else if (blueThresholdha201 <= secha201  && secha201 < yellowThresholdha201  ) {
                        if(!flashingha201){
                            flashingha201 = true; // 停止蓝色闪烁
                            updateButtonColorha2haha01();
                        } else if (flashingha201) {
                            updateButtonColorha2haha01();
                            showConfirmationDialogYNForButton201();
                        }

                    } else if (yellowThresholdha201 <= secha201  && secha201 < redThresholdha201) {
                        if(!flashinghag201){
                            flashinghag201 = true; // 停止黄色闪烁
                            updateButtonColorha2haha01();
                        } else if (flashinghag201) {
                            updateButtonColorha2haha01();
                            showConfirmationDialogYNForButton201();
                        }

                    } else if (secha201 >= redThresholdha201) {
                        updateButtonColorha2haha01();
                        showConfirmationDialogYNForButton201();
                    }
                }
            }
        });

        btnTimerha2haha01.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton201();
                return true;
            }
        });

        btnTimerha2haha02 = findViewById(R.id.b202);
        btnTimerha2haha02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunningha202){
                    showConfirmationDialogForButton202();
                    //isTimerRunningha202 = true;
                    updateButtonColorha2haha02(); // 更新颜色
                } else if (isTimerRunningha202) {
                    if (secha202 < blueThresholdha202) {
                        updateButtonColorha2haha02();
                        showConfirmationDialogYNForButton202();
                    } else if (blueThresholdha202 <= secha202  && secha202 < yellowThresholdha202  ) {
                        if(!flashingha202){
                            flashingha202 = true; // 停止蓝色闪烁
                            updateButtonColorha2haha02();
                        } else if (flashingha202) {
                            updateButtonColorha2haha02();
                            showConfirmationDialogYNForButton202();
                        }

                    } else if (yellowThresholdha202 <= secha202  && secha202 < redThresholdha202) {
                        if(!flashinghag202){
                            flashinghag202 = true; // 停止黄色闪烁
                            updateButtonColorha2haha02();
                        } else if (flashinghag202) {
                            updateButtonColorha2haha02();
                            showConfirmationDialogYNForButton202();
                        }

                    } else if (secha202 >= redThresholdha202) {
                        updateButtonColorha2haha02();
                        showConfirmationDialogYNForButton202();
                    }
                }
            }
        });

        btnTimerha2haha02.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton202();
                return true;
            }
        });

        btnTimerha2haha03 = findViewById(R.id.b203);
        btnTimerha2haha03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunningha203){
                    showConfirmationDialogForButton203();
                    //isTimerRunningha203 = true;
                    updateButtonColorha2haha03(); // 更新颜色
                } else if (isTimerRunningha203) {
                    if (secha203 < blueThresholdha203) {
                        updateButtonColorha2haha03();
                        showConfirmationDialogYNForButton203();
                    } else if (blueThresholdha203 <= secha203  && secha203 < yellowThresholdha203  ) {
                        if(!flashingha203){
                            flashingha203 = true; // 停止蓝色闪烁
                            updateButtonColorha2haha03();
                        } else if (flashingha203) {
                            updateButtonColorha2haha03();
                            showConfirmationDialogYNForButton203();
                        }

                    } else if (yellowThresholdha203 <= secha203  && secha203 < redThresholdha203) {
                        if(!flashinghag203){
                            flashinghag203 = true; // 停止黄色闪烁
                            updateButtonColorha2haha03();
                        } else if (flashinghag203) {
                            updateButtonColorha2haha03();
                            showConfirmationDialogYNForButton203();
                        }

                    } else if (secha203 >= redThresholdha203) {
                        updateButtonColorha2haha03();
                        showConfirmationDialogYNForButton203();
                    }
                }
            }
        });

        btnTimerha2haha03.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton203();
                return true;
            }
        });

        btnTimerha2haha04 = findViewById(R.id.b204);
        btnTimerha2haha04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunningha204){
                    showConfirmationDialogForButton204();
                    //isTimerRunningha204 = true;
                    updateButtonColorha2haha04(); // 更新颜色
                } else if (isTimerRunningha204) {
                    if (secha204 < blueThresholdha204) {
                        updateButtonColorha2haha04();
                        showConfirmationDialogYNForButton204();
                    } else if (blueThresholdha204 <= secha204  && secha204 < yellowThresholdha204  ) {
                        if(!flashingha204){
                            flashingha204 = true; // 停止蓝色闪烁
                            updateButtonColorha2haha04();
                        } else if (flashingha204) {
                            updateButtonColorha2haha04();
                            showConfirmationDialogYNForButton204();
                        }

                    } else if (yellowThresholdha204 <= secha204  && secha204 < redThresholdha204) {
                        if(!flashinghag204){
                            flashinghag204 = true; // 停止黄色闪烁
                            updateButtonColorha2haha04();
                        } else if (flashinghag204) {
                            updateButtonColorha2haha04();
                            showConfirmationDialogYNForButton204();
                        }

                    } else if (secha204 >= redThresholdha204) {
                        updateButtonColorha2haha04();
                        showConfirmationDialogYNForButton204();
                    }
                }
            }
        });

        btnTimerha2haha04.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton204();
                return true;
            }
        });

        btnTimerha2haha6KK = findViewById(R.id.b26KK);
        btnTimerha2haha6KK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isTimerRunningha26KK){
                    showConfirmationDialogForButton26KK();
                    //isTimerRunningha26KK = true;
                    updateButtonColorha2haha6KK(); // 更新颜色
                } else if (isTimerRunningha26KK) {
                    if (secha26KK < blueThresholdha26KK) {
                        updateButtonColorha2haha6KK();
                        showConfirmationDialogYNForButton26KK();
                    } else if (blueThresholdha26KK <= secha26KK  && secha26KK < yellowThresholdha26KK  ) {
                        if(!flashingha26KK){
                            flashingha26KK = true; // 停止蓝色闪烁
                            updateButtonColorha2haha6KK();
                        } else if (flashingha26KK) {
                            updateButtonColorha2haha6KK();
                            showConfirmationDialogYNForButton26KK();
                        }

                    } else if (yellowThresholdha26KK <= secha26KK  && secha26KK < redThresholdha26KK) {
                        if(!flashinghag26KK){
                            flashinghag26KK = true; // 停止黄色闪烁
                            updateButtonColorha2haha6KK();
                        } else if (flashinghag26KK) {
                            updateButtonColorha2haha6KK();
                            showConfirmationDialogYNForButton26KK();
                        }

                    } else if (secha26KK >= redThresholdha26KK) {
                        updateButtonColorha2haha6KK();
                        showConfirmationDialogYNForButton26KK();
                    }
                }
            }
        });

        btnTimerha2haha6KK.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                showTimeDialogForButton26KK();
                return true;
            }
        });

    }
    //--------------------------------------------------------------------------

    @Override
    public void onDestroy() {
        super.onDestroy();
        handlerhaha1.removeCallbacks(updateTimerThreadha1);
        handlerhaha1.removeCallbacks(updateTimerThreadha2);
        handlerhaha1.removeCallbacks(updateTimerThreadha3);
        handlerhaha1.removeCallbacks(updateTimerThreadha4);
        handlerhaha1.removeCallbacks(updateTimerThreadha5);
        handlerhaha1.removeCallbacks(updateTimerThreadha66);
        handlerhaha1.removeCallbacks(updateTimerThreadha7);







        // 停止計時器服務
        Intent timerServiceIntenthaha = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntenthaha);
        // 停止計時器服務
        Intent timerServiceIntenthaha1 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntenthaha1);

        Intent timerServiceIntenthaha2 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntenthaha2);

        Intent timerServiceIntenthaha3 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntenthaha3);

        Intent timerServiceIntenthaha4 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntenthaha4);

        Intent timerServiceIntenthaha5 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntenthaha5);

        Intent timerServiceIntenthaha6 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntenthaha6);

        Intent timerServiceIntenthaha7 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntenthaha7);

        Intent timerServiceIntenthaha8 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntenthaha8);

        Intent timerServiceIntenthaha9 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntenthaha9);

        Intent timerServiceIntenthaha10 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntenthaha10);

        Intent timerServiceIntenthaha11 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntenthaha11);

        Intent timerServiceIntenthaha12 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntenthaha12);

        Intent timerServiceIntenthaha13 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntenthaha13);

        Intent timerServiceIntenthaha14 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntenthaha14);

        Intent timerServiceIntenthaha15 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntenthaha15);

        Intent timerServiceIntenthaha16 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntenthaha16);

        Intent timerServiceIntenthaha17 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntenthaha17);

        Intent timerServiceIntenthaha18 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntenthaha18);

        Intent timerServiceIntenthaha19 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntenthaha19);

        Intent timerServiceIntenthaha20 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntenthaha20);

        Intent timerServiceIntenthaha21 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntenthaha21);

        Intent timerServiceIntenthaha22 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntenthaha22);

        Intent timerServiceIntenthaha23 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntenthaha23);

        Intent timerServiceIntenthaha24 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntenthaha24);

        Intent timerServiceIntenthaha25 = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntenthaha25);

        //Intent timerServiceIntenthaha266 = new Intent(this, TimerServiceS2.class);
        //stopService(timerServiceIntenthaha266);

        Intent timerServiceIntenthaha27KK = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntenthaha27KK);

        Intent timerServiceIntenthaha28KK = new Intent(this,TimerServiceS2.class);
        stopService(timerServiceIntenthaha28KK);

        Intent timerServiceIntenthaha66 = new Intent(this,TimerServiceS2.class);
        stopService(timerServiceIntenthaha66);

        Intent timerServiceIntenthaha26KK = new Intent(this, TimerServiceS2.class);
        stopService(timerServiceIntenthaha26KK);

    }


    @Override
    public void onPause() {
        super.onPause();

        // 在保存計時器1狀態時，使用editorhaha1對象進行同步
        synchronized (editorhaha1) {
            editorhaha1.putBoolean(TIMER_STARTED_KEYhaha1, handlerhaha1.hasCallbacks(updateTimerThreadha1));
            editorhaha1.putLong(START_TIME_KEYhaha1, starttimeha1);
            editorhaha1.putLong(ELAPSED_TIME_KEYhaha1, timeInMillisechaondshaha1);
            editorhaha1.putBoolean("peopleha_key1", peopleha3_1);
            editorhaha1.putBoolean("flashingha_key1", flashingha1);
            editorhaha1.putBoolean("flashinghag_key1", flashinghag1);
            editorhaha1.putBoolean("isTimerRunningha1", isTimerRunningha1);
            editorhaha1.putInt("currentHourha1",currentHourha1);
            editorhaha1.putInt("currentMinuteha1",currentMinuteha1);

            // 保存加時時間到SharedPreferences
            editorhaha1.putInt("blueThresholdha1", blueThresholdha1);
            editorhaha1.putInt("yellowThresholdha1", yellowThresholdha1);
            editorhaha1.putInt("redThresholdha1", redThresholdha1);
            editorhaha1.apply();
        }

        // 在保存計時器2狀態時，使用editorhaha2haha對象進行同步
        synchronized (editorhaha2haha) {
            editorhaha2haha.putBoolean(TIMER_STARTED_KEy2haha, handlerhaha1.hasCallbacks(updateTimerThreadha2));
            editorhaha2haha.putLong(START_TIME_KEy2haha, starttimeha2);
            editorhaha2haha.putLong(ELAPSED_TIME_KEy2haha, timeInMillisechaondshaha2);
            editorhaha2haha.putBoolean("peopleha_key2haha", peopleha3_2);


            editorhaha2haha.putBoolean("flashingha_key2haha", flashingha2);
            editorhaha2haha.putBoolean("flashinghag_key2haha", flashinghag2);
            editorhaha2haha.putBoolean("isTimerRunningha2", isTimerRunningha2);
            editorhaha2haha.putInt("currentHourha2haha", currentHourha2haha);
            editorhaha2haha.putInt("currentMinuteha2", currentMinuteha2);


            // 保存加時時間到SharedPreferences
            editorhaha2haha.putInt("blueThresholdha2", blueThresholdha2);
            editorhaha2haha.putInt("yellowThresholdha2", yellowThresholdha2);
            editorhaha2haha.putInt("redThresholdha2", redThresholdha2);
            editorhaha2haha.apply();
        }

        synchronized (editorhaha3haha) {
            editorhaha3haha.putBoolean(TIMER_STARTED_KEy3haha, handlerhaha1.hasCallbacks(updateTimerThreadha3));
            editorhaha3haha.putLong(START_TIME_KEy3haha, startTimeha3);
            editorhaha3haha.putLong(ELAPSED_TIME_KEy3haha, timeInMillisechaondshaha3);
            editorhaha3haha.putBoolean("peopleha_key3haha", peopleha3_3);

            editorhaha3haha.putBoolean("flashingha_key3haha", flashingha3);
            editorhaha3haha.putBoolean("flashinghag_key3haha", flashinghag3);
            editorhaha3haha.putBoolean("isTimerRunningha3", isTimerRunningha3);
            editorhaha3haha.putInt("currentHourha3haha", currentHourha3haha);
            editorhaha3haha.putInt("currentMinuteha3", currentMinuteha3);


            // 保存加時時間到SharedPreferences
            editorhaha3haha.putInt("blueThresholdha3", blueThresholdha3);
            editorhaha3haha.putInt("yellowThresholdha3", yellowThresholdha3);
            editorhaha3haha.putInt("redThresholdha3", redThresholdha3);
            editorhaha3haha.apply();
        }

        synchronized (editorhaha4) {
            editorhaha4.putBoolean(TIMER_STARTED_KEYhaha4, handlerhaha1.hasCallbacks(updateTimerThreadha4));
            editorhaha4.putLong(START_TIME_KEYhaha4, startTimeha4);
            editorhaha4.putLong(ELAPSED_TIME_KEYhaha4, timeInMillisechaondshaha4);
            editorhaha4.putBoolean("peopleha_key4", peopleha3_4);

            editorhaha4.putBoolean("flashingha_key4", flashingha4);
            editorhaha4.putBoolean("flashinghag_key4", flashinghag4);
            editorhaha4.putBoolean("isTimerRunningha4", isTimerRunningha4);
            editorhaha4.putInt("currentHourha4", currentHourha4);
            editorhaha4.putInt("currentMinuteha4", currentMinuteha4);


            // 保存加時時間到SharedPreferences
            editorhaha4.putInt("blueThresholdha4", blueThresholdha4);
            editorhaha4.putInt("yellowThresholdha4", yellowThresholdha4);
            editorhaha4.putInt("redThresholdha4", redThresholdha4);
            editorhaha4.apply();
        }

        synchronized (editorhaha5) {
            editorhaha5.putBoolean(TIMER_STARTED_KEYhaha5, handlerhaha1.hasCallbacks(updateTimerThreadha5));
            editorhaha5.putLong(START_TIME_KEYhaha5, startTimeha5);
            editorhaha5.putLong(ELAPSED_TIME_KEYhaha5, timeInMillisechaondshaha5);
            editorhaha5.putBoolean("peopleha_key5", peopleha3_5);

            editorhaha5.putBoolean("flashingha_key5", flashingha5);
            editorhaha5.putBoolean("flashinghag_key5", flashinghag5);
            editorhaha5.putBoolean("isTimerRunningha5", isTimerRunningha5);
            editorhaha5.putInt("currentHourha5", currentHourha5);
            editorhaha5.putInt("currentMinuteha5", currentMinuteha5);


// 保存加時時間到SharedPreferences
            editorhaha5.putInt("blueThresholdha5", blueThresholdha5);
            editorhaha5.putInt("yellowThresholdha5", yellowThresholdha5);
            editorhaha5.putInt("redThresholdha5", redThresholdha5);
            editorhaha5.apply();
        }

        synchronized (editorhaha7) {
            editorhaha7.putBoolean(TIMER_STARTED_KEYhaha7, handlerhaha1.hasCallbacks(updateTimerThreadha7));
            editorhaha7.putLong(START_TIME_KEYhaha7, startTimeha7);
            editorhaha7.putLong(ELAPSED_TIME_KEYhaha7, timeInMillisechaondshaha7);
            editorhaha7.putBoolean("peopleha_key7", peopleha3_7);

            editorhaha7.putBoolean("flashingha_key7", flashingha7);
            editorhaha7.putBoolean("flashinghag_key7", flashinghag7);
            editorhaha7.putBoolean("isTimerRunningha7", isTimerRunningha7);

            editorhaha7.putInt("currentHourha7", currentHourha7);
            editorhaha7.putInt("currentMinuteha7", currentMinuteha7);


            // 保存加時時間到SharedPreferences
            editorhaha7.putInt("blueThresholdha7", blueThresholdha7);
            editorhaha7.putInt("yellowThresholdha7", yellowThresholdha7);
            editorhaha7.putInt("redThresholdha7", redThresholdha7);
            editorhaha7.apply();
        }

        synchronized (editorhaha66) {
            editorhaha66.putBoolean(TIMER_STARTED_KEYhaha66, handlerhaha1.hasCallbacks(updateTimerThreadha66));
            editorhaha66.putLong(START_TIME_KEYhaha66, startTimeha66);
            editorhaha66.putLong(ELAPSED_TIME_KEYhaha66, timeInMillisechaondshaha66);
            editorhaha66.putBoolean("peopleha_key66", peopleha3_66);

            editorhaha66.putBoolean("flashingha_key66", flashingha66);
            editorhaha66.putBoolean("flashinghag_key66", flashinghag66);
            editorhaha66.putBoolean("isTimerRunningha66", isTimerRunningha66);
            editorhaha66.putInt("currentHourha66", currentHourha66);
            editorhaha66.putInt("currentMinuteha66", currentMinuteha66);


            editorhaha66.putInt("blueThresholdha66", blueThresholdha66);
            editorhaha66.putInt("yellowThresholdha66", yellowThresholdha66);
            editorhaha66.putInt("redThresholdha66", redThresholdha66);
            editorhaha66.apply();
        }



    }

    @Override
    public void onResume() {
        super.onResume();

        synchronized (editorhaha1) {
            boolean timerStarted1 = sharedPreferenceshaha1.getBoolean(TIMER_STARTED_KEYhaha1, false);
            if (timerStarted1) {
                starttimeha1 = sharedPreferenceshaha1.getLong(START_TIME_KEYhaha1, 0);
                timeInMillisechaondshaha1 = sharedPreferenceshaha1.getLong(ELAPSED_TIME_KEYhaha1, 0);
                secha1 = (int) (timeInMillisechaondshaha1 / 1000);
                handlerhaha1.postDelayed(updateTimerThreadha1, 0);
            }
            peopleha3_1 = sharedPreferenceshaha1.getBoolean("peopleha_key1", false);
            flashingha1 = sharedPreferenceshaha1.getBoolean("flashingha_key1", false);
            flashinghag1 = sharedPreferenceshaha1.getBoolean("flashinghag_key1", false);
            isTimerRunningha1 = sharedPreferenceshaha1.getBoolean("isTimerRunningha1", false);
            currentHourha1 = sharedPreferenceshaha1.getInt("currentHourha1",currentHourha1);
            currentMinuteha1 = sharedPreferenceshaha1.getInt("currentMinuteha1",currentMinuteha1);

            // 恢复加時時間  測試用
            blueThresholdha1 = sharedPreferenceshaha1.getInt("blueThresholdha1", originalblueThresholdhaha2);
            yellowThresholdha1 = sharedPreferenceshaha1.getInt("yellowThresholdha1", originalyellowThresholdhaha2);
            redThresholdha1 = sharedPreferenceshaha1.getInt("redThresholdha1", originalredThresholdhaha2);

            // 更新按鈕的背景顏色
            updateButtonColorha1();
        }

        synchronized (editorhaha2haha) {
            boolean timerStarted2 = sharedPreferenceshaha2.getBoolean(TIMER_STARTED_KEy2haha, false);
            if (timerStarted2) {
                starttimeha2 = sharedPreferenceshaha2.getLong(START_TIME_KEy2haha, 0);
                timeInMillisechaondshaha2 = sharedPreferenceshaha2.getLong(ELAPSED_TIME_KEy2haha, 0);
                secha2 = (int) (timeInMillisechaondshaha2 / 1000);
                handlerhaha1.postDelayed(updateTimerThreadha2, 0);
            }
            peopleha3_2 = sharedPreferenceshaha2.getBoolean("peopleha_key2haha", false);
            flashingha2 = sharedPreferenceshaha2.getBoolean("flashingha_key2haha", false);
            flashinghag2 = sharedPreferenceshaha2.getBoolean("flashinghag_key2haha", false);
            isTimerRunningha2 = sharedPreferenceshaha2.getBoolean("isTimerRunningha2", false);
            currentHourha2haha = sharedPreferenceshaha2.getInt("currentHourha2haha", currentHourha2haha);
            currentMinuteha2 = sharedPreferenceshaha2.getInt("currentMinuteha2", currentMinuteha2);




            // 恢复加時時間
            blueThresholdha2 = sharedPreferenceshaha2.getInt("blueThresholdha2", originalblueThresholdhaha2);
            yellowThresholdha2 = sharedPreferenceshaha2.getInt("yellowThresholdha2", originalyellowThresholdhaha2);
            redThresholdha2 = sharedPreferenceshaha2.getInt("redThresholdha2", originalredThresholdhaha2);

            // 更新按鈕的背景顏色
            updateButtonColorha2haha();
        }

        synchronized (editorhaha3haha) {
            boolean timerStarted3 = sharedPreferenceshaha3.getBoolean(TIMER_STARTED_KEy3haha, false);
            if (timerStarted3) {
                startTimeha3 = sharedPreferenceshaha3.getLong(START_TIME_KEy3haha, 0);
                timeInMillisechaondshaha3 = sharedPreferenceshaha3.getLong(ELAPSED_TIME_KEy3haha, 0);
                secha3 = (int) (timeInMillisechaondshaha3 / 1000);
                handlerhaha1.postDelayed(updateTimerThreadha3, 0);
            }
            peopleha3_3 = sharedPreferenceshaha3.getBoolean("peopleha_key3haha", false);
            flashingha3 = sharedPreferenceshaha3.getBoolean("flashingha_key3haha", false);
            flashinghag3 = sharedPreferenceshaha3.getBoolean("flashinghag_key3haha", false);
            isTimerRunningha3 = sharedPreferenceshaha3.getBoolean("isTimerRunningha3", false);
            currentHourha3haha = sharedPreferenceshaha3.getInt("currentHourha3haha", currentHourha3haha);
            currentMinuteha3 = sharedPreferenceshaha3.getInt("currentMinuteha3", currentMinuteha3);




            // 恢复加時時間
            blueThresholdha3 = sharedPreferenceshaha3.getInt("blueThresholdha3", originalblueThresholdhaha2);
            yellowThresholdha3 = sharedPreferenceshaha3.getInt("yellowThresholdha3", originalyellowThresholdhaha2);
            redThresholdha3 = sharedPreferenceshaha3.getInt("redThresholdha3", originalredThresholdhaha2);

            // 更新按鈕的背景顏色
            updateButtonColorha3haha();
        }

        synchronized (editorhaha4) {
            boolean timerStarted4 = sharedPreferenceshaha4.getBoolean(TIMER_STARTED_KEYhaha4, false);
            if (timerStarted4) {
                startTimeha4 = sharedPreferenceshaha4.getLong(START_TIME_KEYhaha4, 0);
                timeInMillisechaondshaha4 = sharedPreferenceshaha4.getLong(ELAPSED_TIME_KEYhaha4, 0);
                secha4 = (int) (timeInMillisechaondshaha4 / 1000);
                handlerhaha1.postDelayed(updateTimerThreadha4, 0);
            }
            peopleha3_4 = sharedPreferenceshaha4.getBoolean("peopleha_key4", false);
            flashingha4 = sharedPreferenceshaha4.getBoolean("flashingha_key4", false);
            flashinghag4 = sharedPreferenceshaha4.getBoolean("flashinghag_key4", false);
            isTimerRunningha4 = sharedPreferenceshaha4.getBoolean("isTimerRunningha4", false);
            currentHourha4 = sharedPreferenceshaha4.getInt("currentHourha4", currentHourha4);
            currentMinuteha4 = sharedPreferenceshaha4.getInt("currentMinuteha4", currentMinuteha4);



            // 恢复加時時間
            blueThresholdha4 = sharedPreferenceshaha4.getInt("blueThresholdha4", originalblueThresholdhaha2);
            yellowThresholdha4 = sharedPreferenceshaha4.getInt("yellowThresholdha4", originalyellowThresholdhaha2);
            redThresholdha4 = sharedPreferenceshaha4.getInt("redThresholdha4", originalredThresholdhaha2);

            // 更新按鈕的背景顏色
            updateButtonColorha4();
        }

        synchronized (editorhaha5) {
            boolean timerStarted5 = sharedPreferenceshaha5.getBoolean(TIMER_STARTED_KEYhaha5, false);
            if (timerStarted5) {
                startTimeha5 = sharedPreferenceshaha5.getLong(START_TIME_KEYhaha5, 0);
                timeInMillisechaondshaha5 = sharedPreferenceshaha5.getLong(ELAPSED_TIME_KEYhaha5, 0);
                secha5 = (int) (timeInMillisechaondshaha5 / 1000);
                handlerhaha1.postDelayed(updateTimerThreadha5, 0);
            }
            peopleha3_5 = sharedPreferenceshaha5.getBoolean("peopleha_key5", false);
            flashingha5 = sharedPreferenceshaha5.getBoolean("flashingha_key5", false);
            flashinghag5 = sharedPreferenceshaha5.getBoolean("flashinghag_key5", false);
            isTimerRunningha5 = sharedPreferenceshaha5.getBoolean("isTimerRunningha5", false);
            currentHourha5 = sharedPreferenceshaha5.getInt("currentHourha5", currentHourha5);
            currentMinuteha5 = sharedPreferenceshaha5.getInt("currentMinuteha5", currentMinuteha5);




            // 恢复加時時間
            blueThresholdha5 = sharedPreferenceshaha5.getInt("blueThresholdha5", originalblueThresholdhaha2);
            yellowThresholdha5 = sharedPreferenceshaha5.getInt("yellowThresholdha5", originalyellowThresholdhaha2);
            redThresholdha5 = sharedPreferenceshaha5.getInt("redThresholdha5", originalredThresholdhaha2);

            // 更新按鈕的背景顏色
            updateButtonColorha5();
        }



        synchronized (editorhaha7) {
            boolean timerStarted7 = sharedPreferenceshaha7.getBoolean(TIMER_STARTED_KEYhaha7, false);
            if (timerStarted7) {
                startTimeha7 = sharedPreferenceshaha7.getLong(START_TIME_KEYhaha7, 0);
                timeInMillisechaondshaha7 = sharedPreferenceshaha7.getLong(ELAPSED_TIME_KEYhaha7, 0);
                secha7 = (int) (timeInMillisechaondshaha7 / 1000);
                handlerhaha1.postDelayed(updateTimerThreadha7, 0);
            }
            peopleha3_7 = sharedPreferenceshaha7.getBoolean("peopleha_key7", false);
            flashingha7 = sharedPreferenceshaha7.getBoolean("flashingha_key7", false);
            flashinghag7 = sharedPreferenceshaha7.getBoolean("flashinghag_key7", false);
            isTimerRunningha7 = sharedPreferenceshaha7.getBoolean("isTimerRunningha7", false);
            currentHourha7 = sharedPreferenceshaha7.getInt("currentHourha7", currentHourha7);
            currentMinuteha7 = sharedPreferenceshaha7.getInt("currentMinuteha7", currentMinuteha7);




            // 恢复加時時間
            blueThresholdha7 = sharedPreferenceshaha7.getInt("blueThresholdha7", originalblueThresholdhaha2);
            yellowThresholdha7 = sharedPreferenceshaha7.getInt("yellowThresholdha7", originalyellowThresholdhaha2);
            redThresholdha7 = sharedPreferenceshaha7.getInt("redThresholdha7", originalredThresholdhaha2);

            // 更新按鈕的背景顏色
            updateButtonColorha7();
        }

        synchronized (editorhaha66) {
            boolean timerStarted66 = sharedPreferenceshaha66.getBoolean(TIMER_STARTED_KEYhaha66, false);
            if (timerStarted66) {
                startTimeha66 = sharedPreferenceshaha66.getLong(START_TIME_KEYhaha66, 0);
                timeInMillisechaondshaha66 = sharedPreferenceshaha66.getLong(ELAPSED_TIME_KEYhaha66, 0);
                secha66 = (int) (timeInMillisechaondshaha66 / 1000);
                handlerhaha1.postDelayed(updateTimerThreadha66, 0);
            }
            peopleha3_66 = sharedPreferenceshaha66.getBoolean("peopleha_key66", false);
            flashingha66 = sharedPreferenceshaha66.getBoolean("flashingha_key66", false);
            flashinghag66 = sharedPreferenceshaha66.getBoolean("flashinghag_key66", false);
            isTimerRunningha66 = sharedPreferenceshaha66.getBoolean("isTimerRunningha66", false);
            currentHourha66 = sharedPreferenceshaha66.getInt("currentHourha66", currentHourha66);
            currentMinuteha66 = sharedPreferenceshaha66.getInt("currentMinuteha66", currentMinuteha66);




            // 恢复加時時間
            blueThresholdha66 = sharedPreferenceshaha66.getInt("blueThresholdha66", originalblueThresholdhaha2);
            yellowThresholdha66 = sharedPreferenceshaha66.getInt("yellowThresholdha66", originalyellowThresholdhaha2);
            redThresholdha66 = sharedPreferenceshaha66.getInt("redThresholdha66", originalredThresholdhaha2);

            // 更新按鈕的背景顏色
            updateButtonColorha66();

        }


    }

    //--------------------------------------------------------------------------
    //--------------------------------------------------------------------------
    private void stopTimer1() {
        handlerhaha1.removeCallbacks(updateTimerThreadha1);
    }
    private void stopTimer2haha() {
        handlerhaha1.removeCallbacks(updateTimerThreadha2);
    }
    private void stopTimer3haha() {
        handlerhaha1.removeCallbacks(updateTimerThreadha3);
    }
    private void stopTimer4() {
        handlerhaha1.removeCallbacks(updateTimerThreadha4);
    }
    private void stopTimer5() {
        handlerhaha1.removeCallbacks(updateTimerThreadha5);
    }

    private void stopTimer7() {
        handlerhaha1.removeCallbacks(updateTimerThreadha7);
    }

    private void stopTimer66() {
        handlerhaha1.removeCallbacks(updateTimerThreadha66);
    }


    private void resetsechaondsha1() {
        sechaondsha1 = 0;
        secha1 = 0;
        minutesha1 = 0;
        hoursha1 = 0;
        String timeString = String.format("%02d:%02d", hoursha1, minutesha1);
        btnTimerha1.setText(timeString);
    }
    private void resetsechaondsha2() {
        sechaondsha2 = 0;
        secha2 = 0;
        minutesha2 = 0;
        hoursha2 = 0;
        String timeString = String.format("%02d:%02d", hoursha2, minutesha2);
        btnTimerha2haha.setText(timeString);
    }

    private void resetsechaondsha3() {
        sechaondsha3 = 0;
        secha3 = 0;
        minutesha3 = 0;
        hoursha3 = 0;
        String timeString = String.format("%02d:%02d", hoursha3, minutesha3);
        btnTimerha3haha.setText(timeString);
    }

    private void resetsechaondsha4() {
        sechaondsha4 = 0;
        secha4 = 0;
        minutesha4 = 0;
        hoursha4 = 0;
        String timeString = String.format("%02d:%02d", hoursha4, minutesha4);
        btnTimerha4.setText(timeString);
    }
    private void resetsechaondsha5() {
        sechaondsha5 = 0;
        secha5 = 0;
        minutesha5 = 0;
        hoursha5 = 0;
        String timeString = String.format("%02d:%02d", hoursha5, minutesha5);
        btnTimerha5.setText(timeString);
    }

    private void resetsechaondsha7() {
        sechaondsha7 = 0;
        secha7 = 0;
        minutesha7 = 0;
        hoursha7 = 0;
        String timeString = String.format("%02d:%02d", hoursha7, minutesha7);
        btnTimerha7.setText(timeString);
    }

    private void resetsechaondsha66() {
        sechaondsha66 = 0;
        secha66 = 0;
        minutesha66 = 0;
        hoursha66 = 0;
        String timeString = String.format("%02d:%02d",  hoursha66, minutesha66);
        btnTimerha66.setText(timeString);
    }




    private void resetButtonColor1() {
        btnTimerha1.setBackgroundColor(getResources().getColor(R.color.white));
    }
    private void resetButtonColor2haha() {
        btnTimerha2haha.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor3haha() {
        btnTimerha3haha.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor4() {
        btnTimerha4.setBackgroundColor(getResources().getColor(R.color.white));
    }

    private void resetButtonColor5() {
        btnTimerha5.setBackgroundColor(getResources().getColor(R.color.white));
    }
    private void resetButtonColor7() {
        btnTimerha7.setBackgroundColor(getResources().getColor(R.color.white));
    }
    private void resetButtonColor66() {
        btnTimerha66.setBackgroundColor(getResources().getColor(R.color.white));
    }


    private void showConfirmationDialogYNForButton1() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_stop, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否要停止");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopTimer1();
                resetThresholdsToOriginal1();
                resetsechaondsha1();
                resetButtonColor1();
                btnTimerha1.clearAnimation();
                flashingha1 = false;
                flashinghag1 = false;
                isTimerRunningha1 = false;
                dialog.dismiss();

            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }
    private void showConfirmationDialogYNForButton2() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_stop, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否要停止");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopTimer2haha();
                resetThresholdsToOriginal2();
                resetsechaondsha2();
                resetButtonColor2haha();
                btnTimerha2haha.clearAnimation();
                flashingha2 = false;flashinghag2 = false;
                isTimerRunningha2 = false;


                dialog.dismiss();
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }

    private void showConfirmationDialogYNForButton3() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_stop, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否要停止");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopTimer3haha();
                resetThresholdsToOriginal3();
                resetsechaondsha3();
                resetButtonColor3haha();
                btnTimerha3haha.clearAnimation();
                flashingha3 = false;flashinghag3 = false;
                isTimerRunningha3 = false;

                dialog.dismiss();
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }

    private void showConfirmationDialogYNForButton4() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_stop, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否要停止");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopTimer4();
                resetThresholdsToOriginal4();
                resetsechaondsha4();
                resetButtonColor4();
                btnTimerha4.clearAnimation();
                flashingha4 = false;flashinghag4 = false;
                isTimerRunningha4 = false;

                dialog.dismiss();
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }
    private void showConfirmationDialogYNForButton5() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_stop, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否要停止");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopTimer5();
                resetThresholdsToOriginal5();
                resetsechaondsha5();
                resetButtonColor5();
                btnTimerha5.clearAnimation();
                flashingha5 = false;flashinghag5 = false;
                isTimerRunningha5 = false;


                dialog.dismiss();
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }
    private void showConfirmationDialogYNForButton7() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_stop, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否要停止");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopTimer7();
                resetThresholdsToOriginal7();
                resetsechaondsha7();
                resetButtonColor7();
                btnTimerha7.clearAnimation();
                flashingha7 = false;flashinghag7 = false;
                isTimerRunningha7 = false;


                dialog.dismiss();
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }
    private void showConfirmationDialogYNForButton66() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_stop, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否要停止");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopTimer66();
                resetThresholdsToOriginal66();
                resetsechaondsha66();
                resetButtonColor66();
                btnTimerha66.clearAnimation();
                flashingha66 = false;flashinghag66 = false;
                isTimerRunningha66 = false;

                dialog.dismiss();
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }


    private void showConfirmationDialogForButton1() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_person, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否一個人");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_1 = true;
                isTimerRunningha1 = true;
                starttimeha1r();
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime1 = Calendar.getInstance();
                currentHourha1 = currentTime1.get(Calendar.HOUR_OF_DAY);
                currentMinuteha1 = currentTime1.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_1 = false;
                isTimerRunningha1 = true;
                starttimeha1r();
                flashingha1 = true;
                dialog.dismiss();
                // 獲得現在的時間
                Calendar currentTime = Calendar.getInstance();
                currentHourha1 = currentTime.get(Calendar.HOUR_OF_DAY);
                currentMinuteha1 = currentTime.get(Calendar.MINUTE);

            }
        });

        dialog.show();
    }


    private void showConfirmationDialogForButton2() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_person, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否一個人");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_2 = true;isTimerRunningha2 = true;
                starttimeha2r();
                dialog.dismiss();
                Calendar currentTime2 = Calendar.getInstance();
                currentHourha2haha = currentTime2.get(Calendar.HOUR_OF_DAY);
                currentMinuteha2 = currentTime2.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_2 = false;isTimerRunningha2 = true;
                starttimeha2r();
                dialog.dismiss();
                flashingha2 = true;
                Calendar currentTime2 = Calendar.getInstance();
                currentHourha2haha = currentTime2.get(Calendar.HOUR_OF_DAY);
                currentMinuteha2 = currentTime2.get(Calendar.MINUTE);
            }
        });

        dialog.show();
    }

    private void showConfirmationDialogForButton3() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_person, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否一個人");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_3 = true;isTimerRunningha3 = true;
                startTimeha3r();
                dialog.dismiss();
                Calendar currentTime3 = Calendar.getInstance();
                currentHourha3haha = currentTime3.get(Calendar.HOUR_OF_DAY);
                currentMinuteha3 = currentTime3.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_3 = false;isTimerRunningha3 = true;
                startTimeha3r();
                dialog.dismiss();
                flashingha3 = true;
                Calendar currentTime3 = Calendar.getInstance();
                currentHourha3haha = currentTime3.get(Calendar.HOUR_OF_DAY);
                currentMinuteha3 = currentTime3.get(Calendar.MINUTE);
            }
        });

        dialog.show();
    }

    private void showConfirmationDialogForButton4() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_person, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否一個人");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_4 = true;isTimerRunningha4 = true;
                startTimeha4r();
                dialog.dismiss();
                Calendar currentTime4 = Calendar.getInstance();
                currentHourha4 = currentTime4.get(Calendar.HOUR_OF_DAY);
                currentMinuteha4 = currentTime4.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_4 = false;isTimerRunningha4 = true;
                startTimeha4r();
                dialog.dismiss();
                flashingha4 = true;
                Calendar currentTime4 = Calendar.getInstance();
                currentHourha4 = currentTime4.get(Calendar.HOUR_OF_DAY);
                currentMinuteha4 = currentTime4.get(Calendar.MINUTE);
            }
        });

        dialog.show();
    }
    private void showConfirmationDialogForButton5() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_person, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否一個人");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_5 = true;isTimerRunningha5 = true;
                startTimeha5r();
                dialog.dismiss();
                Calendar currentTime5 = Calendar.getInstance();
                currentHourha5 = currentTime5.get(Calendar.HOUR_OF_DAY);
                currentMinuteha5 = currentTime5.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_5 = false;isTimerRunningha5 = true;
                startTimeha5r();
                dialog.dismiss();
                flashingha5 = true;
                Calendar currentTime5 = Calendar.getInstance();
                currentHourha5 = currentTime5.get(Calendar.HOUR_OF_DAY);
                currentMinuteha5 = currentTime5.get(Calendar.MINUTE);
            }
        });

        dialog.show();
    }
    private void showConfirmationDialogForButton7() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_person, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否一個人");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_7 = true;isTimerRunningha7 = true;
                startTimeha7r();
                dialog.dismiss();
                Calendar currentTime7 = Calendar.getInstance();
                currentHourha7 = currentTime7.get(Calendar.HOUR_OF_DAY);
                currentMinuteha7 = currentTime7.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_7 = false;isTimerRunningha7 = true;
                startTimeha7r();
                dialog.dismiss();
                flashingha7 = true;
                Calendar currentTime7 = Calendar.getInstance();
                currentHourha7 = currentTime7.get(Calendar.HOUR_OF_DAY);
                currentMinuteha7 = currentTime7.get(Calendar.MINUTE);

            }
        });

        dialog.show();
    }
    private void showConfirmationDialogForButton66() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        View customView = getLayoutInflater().inflate(R.layout.custom_dialog_layout_person, null);
        builder.setView(customView);

        final AlertDialog dialog = builder.create();

        TextView messageTextView = customView.findViewById(R.id.dialog_message);
        Button positiveButton = customView.findViewById(R.id.positive_button);
        Button negativeButton = customView.findViewById(R.id.negative_button);

        messageTextView.setText("是否一個人");

        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_66 = true;isTimerRunningha66 = true;
                startTimeha66r();
                dialog.dismiss();

                Calendar currentTime66 = Calendar.getInstance();
                currentHourha66 = currentTime66.get(Calendar.HOUR_OF_DAY);
                currentMinuteha66 = currentTime66.get(Calendar.MINUTE);
            }
        });

        negativeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                peopleha3_66 = false;isTimerRunningha66 = true;
                startTimeha66r();
                dialog.dismiss();
                flashingha66 = true;

                Calendar currentTime66 = Calendar.getInstance();
                currentHourha66 = currentTime66.get(Calendar.HOUR_OF_DAY);
                currentMinuteha66 = currentTime66.get(Calendar.MINUTE);
            }
        });

        dialog.show();
    }

    private void starttimeha1r() {
        starttimeha1 = SystemClock.uptimeMillis();
        handlerhaha1.postDelayed(updateTimerThreadha1, 0);
    }
    private void starttimeha2r() {
        starttimeha2 = SystemClock.uptimeMillis();
        handlerhaha1.postDelayed(updateTimerThreadha2, 0);
    }

    private void startTimeha3r() {
        startTimeha3 = SystemClock.uptimeMillis();
        handlerhaha1.postDelayed(updateTimerThreadha3, 0);
    }

    private void startTimeha4r() {
        startTimeha4 = SystemClock.uptimeMillis();
        handlerhaha1.postDelayed(updateTimerThreadha4, 0);
    }
    private void startTimeha5r() {
        startTimeha5 = SystemClock.uptimeMillis();
        handlerhaha1.postDelayed(updateTimerThreadha5, 0);
    }
    private void startTimeha7r() {
        startTimeha7 = SystemClock.uptimeMillis();
        handlerhaha1.postDelayed(updateTimerThreadha7, 0);
    }
    private void startTimeha66r() {
        startTimeha66 = SystemClock.uptimeMillis();
        handlerhaha1.postDelayed(updateTimerThreadha66, 0);
    }




    private void resetThresholdsToOriginal1() {
        //此為測試用 正式版應改為originalyellowThresholdhaha2
        yellowThresholdha1 = originalyellowThresholdhaha2;
        redThresholdha1 = originalredThresholdhaha2;
        blueThresholdha1 = originalblueThresholdhaha2;
        //yellowThresholdha1 = originalyellowThresholdhaha2;
        //redThresholdha1 = originalredThresholdhaha2;
        //blueThresholdha1 = originalblueThresholdhaha2;
        //此為測試用
    }
    private void resetThresholdsToOriginal2() {
        yellowThresholdha2 = originalyellowThresholdhaha2;
        redThresholdha2 = originalredThresholdhaha2;
        blueThresholdha2 = originalblueThresholdhaha2;
    }

    private void resetThresholdsToOriginal3() {
        yellowThresholdha3 = originalyellowThresholdhaha2;
        redThresholdha3 = originalredThresholdhaha2;
        blueThresholdha3 = originalblueThresholdhaha2;
    }

    private void resetThresholdsToOriginal4() {
        yellowThresholdha4 = originalyellowThresholdhaha2;
        redThresholdha4 = originalredThresholdhaha2;
        blueThresholdha4 = originalblueThresholdhaha2;
    }

    private void resetThresholdsToOriginal5() {
        yellowThresholdha5 = originalyellowThresholdhaha2;
        redThresholdha5 = originalredThresholdhaha2;
        blueThresholdha5 = originalblueThresholdhaha2;
    }

    private void resetThresholdsToOriginal7() {
        yellowThresholdha7 = originalyellowThresholdhaha2;
        redThresholdha7 = originalredThresholdhaha2;
        blueThresholdha7 = originalblueThresholdhaha2;
    }
    private void resetThresholdsToOriginal66() {
        yellowThresholdha66 = originalyellowThresholdhaha2;
        redThresholdha66 = originalredThresholdhaha2;
        blueThresholdha66 = originalblueThresholdhaha2;
    }




    private Runnable updateTimerThreadha1 = new Runnable() {
        public void run() {
            timeInMillisechaondshaha1 = SystemClock.uptimeMillis() - starttimeha1;
            updatedtimeha1 = timeInMillisechaondshaha1;
            sechaondsha1 = (int) (updatedtimeha1 / 1000);
            minutesha1 = sechaondsha1 / 60;
            hoursha1 = minutesha1 / 60;
            sechaondsha1 = sechaondsha1 % 60;
            minutesha1 = minutesha1 % 60;
            secha1 = hoursha1 * 3600 + minutesha1 * 60 + sechaondsha1;

            // 计算当前时间加上 redThresholdha1 后的时间（秒数）
            int totalSeconds = currentHourha1 * 60 * 60 + currentMinuteha1 * 60 + redThresholdha1;
            // 计算小时和分钟
            futureHourha1 = totalSeconds / 3600;
            futureMinuteha1 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHourha1 >= 24) {
                futureHourha1 %= 24;
            }


            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourha1, currentMinuteha1);
            String futureTimeString = String.format("%02d:%02d", futureHourha1, futureMinuteha1);

// 計算所需的空格數以實現對齊
            int totalWidth = 11; // 假設總共有11個字符的寬度
            int currentTimeWidth = 5; // currentTimeString的寬度
            int futureTimeWidth = 5; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"---------" + space + futureTimeString;

            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimerha1.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerha1.setText(Html.fromHtml(displayText));
            }

            updateButtonColorha1();
            handlerhaha1.postDelayed(this, 1000);
        }
    };
    private Runnable updateTimerThreadha2 = new Runnable() {
        public void run() {
            timeInMillisechaondshaha2 = SystemClock.uptimeMillis() - starttimeha2;
            updatedtimeha2 = timeInMillisechaondshaha2;
            sechaondsha2 = (int) (updatedtimeha2 / 1000);
            minutesha2 = sechaondsha2 / 60;
            hoursha2 = minutesha2 / 60;
            sechaondsha2 = sechaondsha2 % 60;
            minutesha2 = minutesha2 % 60;
            secha2 = hoursha2 * 3600 + minutesha2 * 60 + sechaondsha2;

            // 计算当前时间加上 redThresholdha2 后的时间（秒数）
            int totalSeconds = currentHourha2haha * 60 * 60 + currentMinuteha2 * 60 + redThresholdha2;
            // 计算小时和分钟
            futureHourha2haha = totalSeconds / 3600;
            futureMinuteha2 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHourha2haha >= 24) {
                futureHourha2haha %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourha2haha, currentMinuteha2);
            String futureTimeString = String.format("%02d:%02d", futureHourha2haha, futureMinuteha2);

// 計算所需的空格數以實現對齊
            int totalWidth = 11; // 假設總共有11個字符的寬度
            int currentTimeWidth = 5; // currentTimeString的寬度
            int futureTimeWidth = 5; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"---------" + space + futureTimeString;

            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimerha2haha.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerha2haha.setText(Html.fromHtml(displayText));
            }

            updateButtonColorha2haha();
            handlerhaha1.postDelayed(this, 1000);
        }
    };

    private Runnable updateTimerThreadha3 = new Runnable() {
        public void run() {
            timeInMillisechaondshaha3 = SystemClock.uptimeMillis() - startTimeha3;
            updatedTime3 = timeInMillisechaondshaha3;
            sechaondsha3 = (int) (updatedTime3 / 1000);
            minutesha3 = sechaondsha3 / 60;
            hoursha3 = minutesha3 / 60;
            sechaondsha3 = sechaondsha3 % 60;
            minutesha3 = minutesha3 % 60;
            secha3 = hoursha3 * 3600 + minutesha3 * 60 + sechaondsha3;

// 计算当前时间加上 redThresholdha3 后的时间（秒数）
            int totalSeconds = currentHourha3haha * 60 * 60 + currentMinuteha3 * 60 + redThresholdha3;
            // 计算小时和分钟
            futureHourha3haha = totalSeconds / 3600;
            futureMinuteha3 = (totalSeconds % 3600) / 60;
            // 处理超过34小时的进位
            if (futureHourha3haha >= 24) {
                futureHourha3haha %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourha3haha, currentMinuteha3);
            String futureTimeString = String.format("%02d:%02d", futureHourha3haha, futureMinuteha3);

// 計算所需的空格數以實現對齊
            int totalWidth = 11; // 假設總共有11個字符的寬度
            int currentTimeWidth = 5; // currentTimeString的寬度
            int futureTimeWidth = 5; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"---------" + space + futureTimeString;

            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimerha3haha.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerha3haha.setText(Html.fromHtml(displayText));
            }

            updateButtonColorha3haha();
            handlerhaha1.postDelayed(this, 1000);
        }
    };

    private Runnable updateTimerThreadha4 = new Runnable() {
        public void run() {
            timeInMillisechaondshaha4 = SystemClock.uptimeMillis() - startTimeha4;
            updatedTime4 = timeInMillisechaondshaha4;
            sechaondsha4 = (int) (updatedTime4 / 1000);
            minutesha4 = sechaondsha4 / 60;
            hoursha4 = minutesha4 / 60;
            sechaondsha4 = sechaondsha4 % 60;
            minutesha4 = minutesha4 % 60;
            secha4 =hoursha4 * 3600 + minutesha4 * 60 + sechaondsha4;


            // 计算当前时间加上 redThresholdha4 后的时间（秒数）
            int totalSeconds = currentHourha4 * 60 * 60 + currentMinuteha4 * 60 + redThresholdha4;
            // 计算小时和分钟
            futureHourha4 = totalSeconds / 3600;
            futureMinuteha4 = (totalSeconds % 3600) / 60;
            // 处理超过44小时的进位
            if (futureHourha4 >= 24) {
                futureHourha4 %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourha4, currentMinuteha4);
            String futureTimeString = String.format("%02d:%02d", futureHourha4, futureMinuteha4);

// 計算所需的空格數以實現對齊
            int totalWidth = 11; // 假設總共有11個字符的寬度
            int currentTimeWidth = 5; // currentTimeString的寬度
            int futureTimeWidth = 5; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"---------" + space + futureTimeString;

            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimerha4.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerha4.setText(Html.fromHtml(displayText));
            }

            updateButtonColorha4();
            handlerhaha1.postDelayed(this, 1000);
        }
    };
    private Runnable updateTimerThreadha5 = new Runnable() {
        public void run() {
            timeInMillisechaondshaha5 = SystemClock.uptimeMillis() - startTimeha5;
            updatedTime5 = timeInMillisechaondshaha5;
            sechaondsha5 = (int) (updatedTime5 / 1000);
            minutesha5 = sechaondsha5 / 60;
            hoursha5 = minutesha5 / 60;
            sechaondsha5 = sechaondsha5 % 60;
            minutesha5 = minutesha5 % 60;
            secha5 =hoursha5 * 3600 + minutesha5 * 60 + sechaondsha5;



            // 计算当前时间加上 redThresholdha5 后的时间（秒数）
            int totalSeconds = currentHourha5 * 60 * 60 + currentMinuteha5 * 60 + redThresholdha5;
            // 计算小时和分钟
            futureHourha5 = totalSeconds / 3600;
            futureMinuteha5 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHourha5 >= 24) {
                futureHourha5 %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourha5, currentMinuteha5);
            String futureTimeString = String.format("%02d:%02d", futureHourha5, futureMinuteha5);

// 計算所需的空格數以實現對齊
            int totalWidth = 11; // 假設總共有11個字符的寬度
            int currentTimeWidth = 5; // currentTimeString的寬度
            int futureTimeWidth = 5; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"---------" + space + futureTimeString;

            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimerha5.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerha5.setText(Html.fromHtml(displayText));
            }

            updateButtonColorha5();
            handlerhaha1.postDelayed(this, 1000);
        }
    };
    private Runnable updateTimerThreadha7 = new Runnable() {
        public void run() {
            timeInMillisechaondshaha7 = SystemClock.uptimeMillis() - startTimeha7;
            updatedTime7 = timeInMillisechaondshaha7;
            sechaondsha7 = (int) (updatedTime7 / 1000);
            minutesha7 = sechaondsha7 / 60;
            hoursha7 = minutesha7 / 60;
            sechaondsha7 = sechaondsha7 % 60;
            minutesha7 = minutesha7 % 60;
            secha7 =hoursha7 * 3600 + minutesha7 * 60 + sechaondsha7;



            // 计算当前时间加上 redThresholdha6 后的时间（秒数）
            int totalSeconds = currentHourha7 * 60 * 60 + currentMinuteha7 * 60 + redThresholdha7;
            // 计算小时和分钟
            futureHourha7 = totalSeconds / 3600;
            futureMinuteha7 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHourha7 >= 24) {
                futureHourha7 %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourha7, currentMinuteha7);
            String futureTimeString = String.format("%02d:%02d", futureHourha7, futureMinuteha7);

// 計算所需的空格數以實現對齊
            int totalWidth = 11; // 假設總共有11個字符的寬度
            int currentTimeWidth = 5; // currentTimeString的寬度
            int futureTimeWidth = 5; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"---------" + space + futureTimeString;

            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimerha7.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerha7.setText(Html.fromHtml(displayText));
            }

            updateButtonColorha7();
            handlerhaha1.postDelayed(this, 1000);
        }
    };
    private Runnable updateTimerThreadha66 = new Runnable() {
        public void run() {
            timeInMillisechaondshaha66 = SystemClock.uptimeMillis() - startTimeha66;
            updatedTime66 = timeInMillisechaondshaha66;
            sechaondsha66 = (int) (updatedTime66 / 1000);
            minutesha66 = sechaondsha66 / 60;
            hoursha66 = minutesha66 / 60;
            sechaondsha66 = sechaondsha66 % 60;
            minutesha66 = minutesha66 % 60;
            secha66 =hoursha66 * 3600 + minutesha66 * 60 + sechaondsha66;


            // 计算当前时间加上 redThresholdha6 后的时间（秒数）
            int totalSeconds = currentHourha66 * 60 * 60 + currentMinuteha66 * 60 + redThresholdha66;
            // 计算小时和分钟
            futureHourha66 = totalSeconds / 3600;
            futureMinuteha66 = (totalSeconds % 3600) / 60;
            // 处理超过24小时的进位
            if (futureHourha66 >= 24) {
                futureHourha66 %= 24;
            }

            // 格式化時間
            String currentTimeString = String.format("%02d:%02d", currentHourha66, currentMinuteha66);
            String futureTimeString = String.format("%02d:%02d", futureHourha66, futureMinuteha66);

// 計算所需的空格數以實現對齊
            int totalWidth = 11; // 假設總共有11個字符的寬度
            int currentTimeWidth = 5; // currentTimeString的寬度
            int futureTimeWidth = 5; // futureTimeString的寬度
            int spaceWidth = totalWidth - currentTimeWidth - futureTimeWidth;

// 創建空格字符串
            String space = new String(new char[spaceWidth]).replace('\0', ' ');

// 在Button中顯示時間，使用HTML標記換行
            String displayText = currentTimeString + space +"---------" + space + futureTimeString;

            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                btnTimerha66.setText(Html.fromHtml(displayText, Html.FROM_HTML_MODE_LEGACY));
            } else {
                btnTimerha66.setText(Html.fromHtml(displayText));
            }

            updateButtonColorha66();
            handlerhaha1.postDelayed(this, 1000);
        }
    };



    public class CustomArrayAdapter extends ArrayAdapter<String> {
        private Context context;
        private String[] options;
        private int textSize; // 字体大小字段

        public CustomArrayAdapter(Context context, String[] options, int textSize) {
            super(context, R.layout.custom_dialog_layout, options);
            this.context = context;
            this.options = options;
            this.textSize = textSize; // 设置字体大小
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View rowView = inflater.inflate(R.layout.custom_dialog_layout, parent, false);

            TextView textView = rowView.findViewById(R.id.dialogTitle);
            textView.setText(options[position]);

            // 根据选项文本设置字体大小
            if (options[position].equals("30秒") || options[position].equals("60秒")) {
                textView.setTextSize(textSize); // 设置大字体大小
            } else {
                textView.setTextSize(textSize - 4); // 设置较小字体大小
            }

            return rowView;
        }
    }

    private void showTimeDialogForButton1() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("1號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘":
                    addtime1(time1);//time1

                    if(secha1 >= blueThresholdha1){
                        flashingha1 = true;
                        updateButtonColorha1();
                    }
                    if(flashinghag1){
                        flashinghag1 = false;
                        updateButtonColorha1();
                    }

                    break;
                case "60分鐘":
                    addtime1(time2);//time2

                    if(secha1 >= blueThresholdha1){
                        flashingha1 = true;
                        updateButtonColorha1();
                    }
                    if(flashinghag1){
                        flashinghag1 = false;
                        updateButtonColorha1();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }
    private void showTimeDialogForButton2() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("2號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘":
                    addtime2(time1);

                    if (secha2 >= blueThresholdha2) {
                        flashingha2 = true;
                        updateButtonColorha2haha();
                    }

                    if (flashinghag2) {
                        flashinghag2 = false;
                        updateButtonColorha2haha();
                    }
                    break;
                case "60分鐘":
                    addtime2(time2);
                    if (secha2 >= blueThresholdha2) {
                        flashingha2 = true;
                        updateButtonColorha2haha();
                    }

                    if (flashinghag2) {
                        flashinghag2 = false;
                        updateButtonColorha2haha();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }

    private void showTimeDialogForButton3() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("5號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘":
                    addTime3(time1); // Customize the time for buttonh 3


                    if (secha3 >= blueThresholdha3) {
                        flashingha3 = true;
                        updateButtonColorha3haha();
                    }

                    if (flashinghag3) {
                        flashinghag3 = false;
                        updateButtonColorha3haha();
                    }

                    break;
                case "60分鐘":
                    addTime3(time2); // Customize the time for buttonh 3

                    if (secha3 >= blueThresholdha3) {
                        flashingha3 = true;
                        updateButtonColorha3haha();
                    }
                    if (flashinghag3) {
                        flashinghag3 = false;
                        updateButtonColorha3haha();
                    }

                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }

    private void showTimeDialogForButton4() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("7號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘":
                    addTime4(time1); // Customize the time for buttonh 4


                    if (secha4 >= blueThresholdha4) {
                        flashingha4 = true;
                        updateButtonColorha4();
                    }
                    if (flashinghag4) {
                        flashinghag4 = false;
                        updateButtonColorha4();
                    }
                    break;
                case "60分鐘":
                    addTime4(time2); // Customize the time for buttonh 4


                    if (secha4 >= blueThresholdha4) {
                        flashingha4 = true;
                        updateButtonColorha4();
                    }
                    if (flashinghag4) {
                        flashinghag4 = false;
                        updateButtonColorha4();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }
    private void showTimeDialogForButton5() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("8號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘":
                    addTime5(time1); // Customize the time for buttonh 5



                    if (secha5 >= blueThresholdha5) {
                        flashingha5 = true;
                        updateButtonColorha5();
                    }
                    if (flashinghag5) {
                        flashinghag5 = false;
                        updateButtonColorha5();
                    }
                    break;
                case "60分鐘":
                    addTime5(time2); // Customize the time for buttonh 5

                    if (secha5 >= blueThresholdha5) {
                        flashingha5 = true;
                        updateButtonColorha5();
                    }
                    if (flashinghag5) {
                        flashinghag5 = false;
                        updateButtonColorha5();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }
    private void showTimeDialogForButton7() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("10號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘":
                    addTime7(time1); // Customize the time for buttonh 7



                    if (secha7 >= blueThresholdha7) {
                        flashingha7 = true;
                        updateButtonColorha7();
                    }
                    if (flashinghag7) {
                        flashinghag7 = false;
                        updateButtonColorha7();
                    }
                    break;
                case "60分鐘":
                    addTime7(time2); // Customize the time for buttonh 7

                    if (secha7 >= blueThresholdha7) {
                        flashingha7 = true;
                        updateButtonColorha7();
                    }
                    if (flashinghag7) {
                        flashinghag7 = false;
                        updateButtonColorha7();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }
    private void showTimeDialogForButton66() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.custom_dialog_layout, null);
        builder.setView(dialogView);

        TextView dialogTitle = dialogView.findViewById(R.id.dialogTitle);
        ListView routeListView = dialogView.findViewById(R.id.routeListView);

        dialogTitle.setText("9號加時");

        final String[] options = {"30分鐘", "60分鐘"};
        int textSize = 60; // 设置所需的字体大小
        CustomArrayAdapter adapter = new CustomArrayAdapter(this, options, textSize);
        routeListView.setAdapter(adapter);

        final AlertDialog dialog = builder.create();
        routeListView.setOnItemClickListener((parent, view, position, id) -> {
            String which = options[position];
            switch (which) {
                case "30分鐘":
                    addTime66(time1); // Customize the time for buttonh 66

                    if (secha66 >= blueThresholdha66) {
                        flashingha66 = true;
                        updateButtonColorha66();
                    }

                    if (flashinghag66) {
                        flashinghag66 = false;
                        updateButtonColorha66();
                    }
                    break;
                case "60分鐘":
                    addTime66(time2); // Customize the time for buttonh 66

                    if (secha66 >= blueThresholdha66) {
                        flashingha66 = true;
                        updateButtonColorha66();
                    }
                    if (flashinghag66) {
                        flashinghag66 = false;
                        updateButtonColorha66();
                    }
                    break;
            }
            dialog.dismiss();
        });
        dialog.show();
    }


    private void addtime1(int sechaondshaToAdd) {
        //blueThresholdha1 += sechaondshaToAdd;
        yellowThresholdha1 += sechaondshaToAdd;
        redThresholdha1 += sechaondshaToAdd;
        updateButtonColorha1();
    }
    private void addtime2(int sechaondshaToAdd) {
        //blueThresholdha2 += sechaondshaToAdd;
        yellowThresholdha2 += sechaondshaToAdd;
        redThresholdha2 += sechaondshaToAdd;

        updateButtonColorha2haha();
    }

    private void addTime3(int sechaondshaToAdd) {
        //blueThresholdha3 += sechaondshaToAdd; // Customize for buttonh 3
        yellowThresholdha3 += sechaondshaToAdd; // Customize for buttonh 3
        redThresholdha3 += sechaondshaToAdd; // Customize for buttonh 3

        updateButtonColorha3haha();
    }

    private void addTime4(int sechaondshaToAdd) {
        //blueThresholdha4 += sechaondshaToAdd; // Customize for buttonh 4
        yellowThresholdha4 += sechaondshaToAdd; // Customize for buttonh 4
        redThresholdha4 += sechaondshaToAdd; // Customize for buttonh 4

        updateButtonColorha4();
    }
    private void addTime5(int sechaondshaToAdd) {
        //blueThresholdha5 += sechaondshaToAdd; // Customize for buttonh 5
        yellowThresholdha5 += sechaondshaToAdd; // Customize for buttonh 5
        redThresholdha5 += sechaondshaToAdd; // Customize for buttonh 5

        updateButtonColorha5();
    }
    private void addTime7(int sechaondshaToAdd) {
        //blueThresholdha7 += sechaondshaToAdd; // Customize for buttonh 7
        yellowThresholdha7 += sechaondshaToAdd; // Customize for buttonh 7
        redThresholdha7 += sechaondshaToAdd; // Customize for buttonh 7

        updateButtonColorha7();
    }
    private void addTime66(int sechaondshaToAdd) {
        //blueThresholdha66 += sechaondshaToAdd; // Customize for buttonh 66
        yellowThresholdha66 += sechaondshaToAdd; // Customize for buttonh 66
        redThresholdha66 += sechaondshaToAdd; // Customize for buttonh 66


        // 根據加時後的時間設置按鈕的背景顏色
        updateButtonColorha66();
    }


    //--------------------------------------------------------------------------

//--------------------------------------------------------------------------


    private void updateButtonColorha1() {
        if (secha1 < 0.01) {
            btnTimerha1.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (secha1 < blueThresholdha1 && peopleha3_1) {
            btnTimerha1.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secha1 < blueThresholdha1 && !peopleha3_1 ) {
            btnTimerha1.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secha1 < yellowThresholdha1 && peopleha3_1) {
            btnTimerha1.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!flashingha1 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerha1.startAnimation(blinkAnimation);
            }else{
                btnTimerha1.clearAnimation();
            }
        } else if (secha1 < yellowThresholdha1 && !peopleha3_1) {
            btnTimerha1.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secha1 < redThresholdha1) {
            btnTimerha1.setBackgroundColor(getResources().getColor(R.color.yellow));

            if(!flashinghag1 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerha1.startAnimation(blinkAnimation);
            }else{
                btnTimerha1.clearAnimation();
            }
        } else {
            btnTimerha1.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerha1.clearAnimation();
        }
    }
    private void updateButtonColorha2haha() {
        if (secha2 < 0.01) {
            btnTimerha2haha.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (secha2 < blueThresholdha2 && peopleha3_2) {
            btnTimerha2haha.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secha2 < blueThresholdha2 && !peopleha3_2 ) {
            btnTimerha2haha.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secha2 < yellowThresholdha2 && peopleha3_2) {
            btnTimerha2haha.setBackgroundColor(getResources().getColor(R.color.blue));

            if(!flashingha2 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerha2haha.startAnimation(blinkAnimation);
            }else{
                btnTimerha2haha.clearAnimation();
            }
        } else if (secha2 < yellowThresholdha2 && !peopleha3_2) {
            btnTimerha2haha.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secha2 < redThresholdha2) {
            btnTimerha2haha.setBackgroundColor(getResources().getColor(R.color.yellow));

            if(!flashinghag2 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerha2haha.startAnimation(blinkAnimation);
            }else{
                btnTimerha2haha.clearAnimation();
            }
        } else {
            btnTimerha2haha.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerha2haha.clearAnimation();
        }
    }

    private void updateButtonColorha3haha() {
        if (secha3 < 0.01) {
            btnTimerha3haha.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (secha3 < blueThresholdha3 && peopleha3_3) {
            btnTimerha3haha.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secha3 < blueThresholdha3 && !peopleha3_3 ) {
            btnTimerha3haha.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secha3 < yellowThresholdha3 && peopleha3_3) {
            btnTimerha3haha.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashingha3 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerha3haha.startAnimation(blinkAnimation);
            }else{
                btnTimerha3haha.clearAnimation();
            }


        } else if (secha3 < yellowThresholdha3 && !peopleha3_3) {
            btnTimerha3haha.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secha3 < redThresholdha3) {
            btnTimerha3haha.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashinghag3 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerha3haha.startAnimation(blinkAnimation);
            }else{
                btnTimerha3haha.clearAnimation();
            }


        } else {
            btnTimerha3haha.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerha3haha.clearAnimation();
        }
    }

    private void updateButtonColorha4() {
        if (secha4 < 0.01) {
            btnTimerha4.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (secha4 < blueThresholdha4 && peopleha3_4) {
            btnTimerha4.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secha4 < blueThresholdha4 && !peopleha3_4 ) {
            btnTimerha4.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secha4 < yellowThresholdha4 && peopleha3_4) {
            btnTimerha4.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashingha4 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerha4.startAnimation(blinkAnimation);
            }else{
                btnTimerha4.clearAnimation();
            }


        } else if (secha4 < yellowThresholdha4 && !peopleha3_4) {
            btnTimerha4.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secha4 < redThresholdha4) {
            btnTimerha4.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashinghag4 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerha4.startAnimation(blinkAnimation);
            }else{
                btnTimerha4.clearAnimation();
            }


        } else {
            btnTimerha4.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerha4.clearAnimation();
        }
    }
    private void updateButtonColorha5() {
        if (secha5 < 0.01) {
            btnTimerha5.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (secha5 < blueThresholdha5 && peopleha3_5) {
            btnTimerha5.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secha5 < blueThresholdha5 && !peopleha3_5 ) {
            btnTimerha5.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secha5 < yellowThresholdha5 && peopleha3_5) {
            btnTimerha5.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashingha5 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerha5.startAnimation(blinkAnimation);
            }else{
                btnTimerha5.clearAnimation();
            }


        } else if (secha5 < yellowThresholdha5 && !peopleha3_5) {
            btnTimerha5.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secha5 < redThresholdha5) {
            btnTimerha5.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashinghag5 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerha5.startAnimation(blinkAnimation);
            }else{
                btnTimerha5.clearAnimation();
            }


        } else {
            btnTimerha5.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerha5.clearAnimation();
        }
    }

    private void updateButtonColorha7() {
        if (secha7 < 0.01) {
            btnTimerha7.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (secha7 < blueThresholdha7 && peopleha3_7) {
            btnTimerha7.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secha7 < blueThresholdha7 && !peopleha3_7 ) {
            btnTimerha7.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secha7 < yellowThresholdha7 && peopleha3_7) {
            btnTimerha7.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashingha7 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerha7.startAnimation(blinkAnimation);
            }else{
                btnTimerha7.clearAnimation();
            }


        } else if (secha7 < yellowThresholdha7 && !peopleha3_7) {
            btnTimerha7.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secha7 < redThresholdha7) {
            btnTimerha7.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashinghag7 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerha7.startAnimation(blinkAnimation);
            }else{
                btnTimerha7.clearAnimation();
            }


        } else {
            btnTimerha7.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerha7.clearAnimation();
        }
    }
    private void updateButtonColorha66() {
        if (secha66 < 0.01) {
            btnTimerha66.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (secha66 < blueThresholdha66 && peopleha3_66) {
            btnTimerha66.setBackgroundColor(getResources().getColor(R.color.CCFFFF));
        } else if (secha66 < blueThresholdha66 && !peopleha3_66 ) {
            btnTimerha66.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secha66 < yellowThresholdha66 && peopleha3_66) {
            btnTimerha66.setBackgroundColor(getResources().getColor(R.color.blue));
            if(!flashingha66 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerha66.startAnimation(blinkAnimation);
            }else{
                btnTimerha66.clearAnimation();
            }


        } else if (secha66 < yellowThresholdha66 && !peopleha3_66) {
            btnTimerha66.setBackgroundColor(getResources().getColor(R.color.purple));
        } else if (secha66 < redThresholdha66) {
            btnTimerha66.setBackgroundColor(getResources().getColor(R.color.yellow));
            if(!flashinghag66 ){
                Animation blinkAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);
                btnTimerha66.startAnimation(blinkAnimation);
            }else{
                btnTimerha66.clearAnimation();
            }


        } else {
            btnTimerha66.setBackgroundColor(getResources().getColor(R.color.red));
            btnTimerha66.clearAnimation();
        }
    }

}*/

