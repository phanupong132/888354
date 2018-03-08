<?xml version="1.0" encoding="utf-8"?>
<android.support.constraint.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:id="@+id/content_main"
    app:layout_behavior="@string/appbar_scrolling_view_behavior"
    tools:context="com.example.phanu.test_midterm1.MainActivity"
    tools:showIn="@layout/app_bar_main">

    <ScrollView
        android:layout_width="match_parent"
        android:layout_height="match_parent">
    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:orientation="vertical"
        android:background="@drawable/background_bookstore">

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="horizontal">
            <LinearLayout
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:orientation="vertical"
                android:layout_margin="10dp">
                <ImageView
                    android:id="@+id/book1"
                    android:layout_width="140dp"
                    android:layout_height="120dp"
                    android:src="@drawable/book1"/>
                <TextView
                    android:id="@+id/txt1"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:text="บุพเพสันนิวาส"
                    android:textSize="15dp"
                    android:layout_gravity="center"
                    />
                <TextView
                    android:id="@+id/cost1"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:text="289 บาท"
                    android:textSize="15dp"
                    android:layout_gravity="center"
                    />
            </LinearLayout> //หนังสือ 1 เล่ม

            <LinearLayout
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:orientation="vertical"
                android:layout_margin="10dp">
                <ImageView
                    android:id="@+id/book2"
                    android:layout_width="140dp"
                    android:layout_height="120dp"
                    android:src="@drawable/book1"/>
                <TextView
                    android:id="@+id/txt2"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:text="ดาวเกี้ยวเดือน"
                    android:textSize="15dp"
                    android:layout_gravity="center"
                    />
                <TextView
                    android:id="@+id/cost2"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:text="349 บาท"
                    android:textSize="15dp"
                    android:layout_gravity="center"
                    />
            </LinearLayout>

            <LinearLayout
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:orientation="vertical"
                android:layout_margin="10dp">
                <ImageView
                    android:id="@+id/book7"
                    android:layout_width="140dp"
                    android:layout_height="120dp"
                    android:src="@drawable/book1"/>
                <TextView
                    android:id="@+id/txt7"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:text="เรือนพะยอม"
                    android:textSize="15dp"
                    android:layout_gravity="center"
                    />
                <TextView
                    android:id="@+id/cost7"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:text="159 บาท"
                    android:textSize="15dp"
                    android:layout_gravity="center"
                    />
            </LinearLayout>

        </LinearLayout> //จัดคอลัมหนังสือ

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="horizontal">
            <LinearLayout
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:orientation="vertical"
                android:layout_margin="10dp">
                <ImageView
                    android:id="@+id/book8"
                    android:layout_width="140dp"
                    android:layout_height="120dp"
                    android:src="@drawable/book1"/>
                <TextView
                    android:id="@+id/txt8"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:text="มาณีรัตนา"
                    android:textSize="15dp"
                    android:layout_gravity="center"
                    />
                <TextView
                    android:id="@+id/cost8"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:text="189 บาท"
                    android:textSize="15dp"
                    android:layout_gravity="center"
                    />
            </LinearLayout> //หนังสือ 1 เล่ม

            <LinearLayout
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:orientation="vertical"
                android:layout_margin="10dp">
                <ImageView
                    android:id="@+id/book4"
                    android:layout_width="140dp"
                    android:layout_height="120dp"
                    android:src="@drawable/book1"/>
                <TextView
                    android:id="@+id/txt4"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:text="โ๓คีธารา"
                    android:textSize="15dp"
                    android:layout_gravity="center"
                    />
                <TextView
                    android:id="@+id/cost4"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:text="349 บาท"
                    android:textSize="15dp"
                    android:layout_gravity="center"
                    />
            </LinearLayout>

            <LinearLayout
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:orientation="vertical"
                android:layout_margin="10dp">
                <ImageView
                    android:id="@+id/book5"
                    android:layout_width="140dp"
                    android:layout_height="120dp"
                    android:src="@drawable/book1"/>
                <TextView
                    android:id="@+id/txt5"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:text="หิมพาน"
                    android:textSize="15dp"
                    android:layout_gravity="center"
                    />
                <TextView
                    android:id="@+id/cost5"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:text="159 บาท"
                    android:textSize="15dp"
                    android:layout_gravity="center"
                    />
            </LinearLayout>

        </LinearLayout> //จัดคอลัมหนังสือ

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="horizontal">
            <LinearLayout
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:orientation="vertical"
                android:layout_margin="10dp">
                <ImageView
                    android:id="@+id/book12"
                    android:layout_width="140dp"
                    android:layout_height="120dp"
                    android:src="@drawable/book1"/>
                <TextView
                    android:id="@+id/txt12"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:text="บุพเพสันนิวาส"
                    android:textSize="15dp"
                    android:layout_gravity="center"
                    />
                <TextView
                    android:id="@+id/cost12"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:text="289 บาท"
                    android:textSize="15dp"
                    android:layout_gravity="center"
                    />
            </LinearLayout> //หนังสือ 1 เล่ม

            <LinearLayout
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:orientation="vertical"
                android:layout_margin="10dp">
                <ImageView
                    android:id="@+id/book11"
                    android:layout_width="140dp"
                    android:layout_height="120dp"
                    android:src="@drawable/book1"/>
                <TextView
                    android:id="@+id/txt11"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:text="ดาวเกี้ยวเดือน"
                    android:textSize="15dp"
                    android:layout_gravity="center"
                    />
                <TextView
                    android:id="@+id/cost11"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:text="349 บาท"
                    android:textSize="15dp"
                    android:layout_gravity="center"
                    />
            </LinearLayout>

            <LinearLayout
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:orientation="vertical"
                android:layout_margin="10dp">
                <ImageView
                    android:id="@+id/book10"
                    android:layout_width="140dp"
                    android:layout_height="120dp"
                    android:src="@drawable/book1"/>
                <TextView
                    android:id="@+id/txt10"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:text="เรือนพะยอม"
                    android:textSize="15dp"
                    android:layout_gravity="center"
                    />
                <TextView
                    android:id="@+id/cost10"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:text="159 บาท"
                    android:textSize="15dp"
                    android:layout_gravity="center"
                    />
            </LinearLayout>

        </LinearLayout> //จัดคอลัมหนังสือ

    </LinearLayout> //กรอบทั้งหมดของจอ
    </ScrollView>
</android.support.constraint.ConstraintLayout>
