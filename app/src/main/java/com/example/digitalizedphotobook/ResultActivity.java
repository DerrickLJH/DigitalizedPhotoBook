package com.example.digitalizedphotobook;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import org.opencv.android.Utils;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.core.MatOfPoint;
import org.opencv.core.Size;
import org.opencv.imgproc.Imgproc;

import java.util.ArrayList;

public class ResultActivity extends AppCompatActivity {

    ImageView ivColour, ivResult;
    private String selection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        ivColour = findViewById(R.id.ivColour);
        ivResult = findViewById(R.id.ivResult);

        final String[] matArr = this.getResources().getStringArray(R.array.mats);
        ivColour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(ResultActivity.this);
                builder.setTitle("Select Image Mode");
                builder.setSingleChoiceItems(R.array.mats, -1, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        selection = matArr[which];
                    }
                });
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        switch (selection) {
                            case "RGBA":
//                                Utils.matToBitmap(mat, newBmp);
//                                ivResult.setImageBitmap(newBmp);
                                break;
                            case "Grey Scale":
//                                Mat greyscale = new Mat(newBmp.getWidth(), newBmp.getHeight(), CvType.CV_8UC1);
//                                Imgproc.cvtColor(mat, greyscale, Imgproc.COLOR_RGB2GRAY, 1);
//                                Imgproc.GaussianBlur(greyscale, greyscale, new Size(5, 5), 0);
//                                Imgproc.dilate(greyscale, greyscale, Imgproc.getStructuringElement(Imgproc.MORPH_RECT, new Size(3, 3)));
//                                Imgproc.erode(greyscale, greyscale, Imgproc.getStructuringElement(Imgproc.MORPH_RECT, new Size(3,3)));
//
//                                Imgproc.Canny(greyscale, greyscale, 50, 150);
//                                Utils.matToBitmap(greyscale, newBmp);
//                                ivResult.setImageBitmap(newBmp);
                                break;
                            case "Canny":
//                                ArrayList<MatOfPoint> contours = findContours(mat);
//
//                                Mat doc = new Mat(mat.size(), CvType.CV_8UC4);
//
//                                if (quad != null) {
//
//                                } else {
//                                    mat.copyTo(doc);
//                                    Log.i("Points", "failed");
//                                }
//                                enhanceDocument(doc);
//                                ivResult.setImageBitmap(newBmp);
                                break;
                            default:
                                return;
                        }
                    }
                }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });

                AlertDialog alert = builder.create();
                alert.show();
            }
        });
    }
}
