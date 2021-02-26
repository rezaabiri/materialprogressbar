package ir.cenlearn.materialprogressbar;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;

public class ProgressMaterial {

    AlertDialog dialogBuilder;

    public void show(Context context, Boolean cancelable){

        dialogBuilder = new AlertDialog.Builder(context).create();
        LayoutInflater inflater = LayoutInflater.from(context);
        View dialogView = inflater.inflate(R.layout.layout_progressbar_material, null);
        dialogBuilder.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        dialogBuilder.setView(dialogView);
        dialogBuilder.setCancelable(cancelable);
        dialogBuilder.show();
    }
    public void dismiss(){
        dialogBuilder.dismiss();
    }
}
