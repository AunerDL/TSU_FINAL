package com.example.ejercicioseliud;

        import android.content.Intent;
        import android.os.Bundle;
        import androidx.fragment.app.FragmentActivity;
        import androidx.fragment.app.FragmentManager;
        import android.view.View;
        import android.widget.Button;
        import android.widget.Toast;

public class Ejercicio16 extends FragmentActivity
        implements InputNameDialogFragment.InputNameDialogListener,
        YesNoDialogFragment.YesNoDialogListener {

    Button salir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio16);

        salir=(Button) findViewById(R.id.btnSalir16);

        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ejer = new Intent(Ejercicio16.this, MainActivity.class);
                startActivity(ejer);
            }
        });
    }
    //===Input Name Dialog===
    public void btnShowDialog(View view) {
        showInputNameDialog();
    }
    private void showInputNameDialog() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        InputNameDialogFragment inputNameDialog = new InputNameDialogFragment();
        inputNameDialog.setCancelable(false);
        inputNameDialog.setDialogTitle("Enter Name");
        inputNameDialog.show(fragmentManager, "input dialog");
    }
    @Override
    public void onFinishInputDialog(String inputText) {
        Toast.makeText(this, "Returned from dialog: " + inputText,
                Toast.LENGTH_SHORT).show();
    }
    //===YES/No Dialog===
    public void btnShowYesNoDialog(View view) {
        showYesNoDialog();
    }
    private void showYesNoDialog() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        YesNoDialogFragment yesnoDialog = new YesNoDialogFragment();
        yesnoDialog.setCancelable(false);
        yesnoDialog.setDialogTitle("Status change");
        yesnoDialog.show(fragmentManager, "yes/no dialog");
    }
    @Override
    public void onFinishYesNoDialog(boolean state) {
        Toast.makeText(this, "Returned from dialog: " + state,
                Toast.LENGTH_SHORT).show();
    }

}