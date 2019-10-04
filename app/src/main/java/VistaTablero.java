
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.tetris.R;
import java.util.ArrayList;

public class VistaTablero extends AppCompatActivity {
    ArrayList<TextView> ListaCeldas = new ArrayList<TextView>(200);
    public VistaTablero(){
        TextView ayuda;
        ayuda = findViewById(R.id.a1);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.b1);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.c1);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.d1);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.e1);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.f1);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.g1);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.h1);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.i1);
        ListaCeldas.add(ayuda);

        ayuda = findViewById(R.id.a2);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.b2);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.c2);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.d2);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.e2);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.f2);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.g2);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.h2);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.i2);
        ListaCeldas.add(ayuda);

        ayuda = findViewById(R.id.a3);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.b3);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.c3);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.d3);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.e3);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.f3);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.g3);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.h3);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.i3);
        ListaCeldas.add(ayuda);

        ayuda = findViewById(R.id.a4);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.b4);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.c4);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.d4);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.e4);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.f4);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.g4);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.h4);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.i4);
        ListaCeldas.add(ayuda);

        ayuda = findViewById(R.id.a5);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.b5);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.c5);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.d5);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.e5);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.f5);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.g5);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.h5);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.i5);
        ListaCeldas.add(ayuda);

        ayuda = findViewById(R.id.a6);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.b6);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.c6);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.d6);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.e6);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.f6);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.g6);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.h6);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.i6);
        ListaCeldas.add(ayuda);

        ayuda = findViewById(R.id.a8);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.b8);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.c8);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.d8);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.e8);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.f8);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.g8);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.h8);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.i8);
        ListaCeldas.add(ayuda);

        ayuda = findViewById(R.id.a9);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.b9);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.c9);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.d9);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.e9);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.f9);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.g9);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.h9);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.i9);
        ListaCeldas.add(ayuda);

        ayuda = findViewById(R.id.a10);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.b10);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.c10);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.d10);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.e10);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.f10);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.g10);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.h10);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.i10);
        ListaCeldas.add(ayuda);

        ayuda = findViewById(R.id.a11);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.b11);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.c11);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.d11);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.e11);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.f11);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.g11);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.h11);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.i11);
        ListaCeldas.add(ayuda);

        ayuda = findViewById(R.id.a12);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.b12);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.c12);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.d12);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.e12);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.f12);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.g12);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.h12);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.i12);
        ListaCeldas.add(ayuda);

        ayuda = findViewById(R.id.a13);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.b13);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.c13);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.d13);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.e13);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.f13);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.g13);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.h13);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.i13);
        ListaCeldas.add(ayuda);

        ayuda = findViewById(R.id.a14);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.b14);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.c14);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.d14);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.e14);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.f14);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.g14);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.h14);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.i14);
        ListaCeldas.add(ayuda);

        ayuda = findViewById(R.id.a15);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.b15);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.c15);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.d15);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.e15);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.f15);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.g15);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.h15);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.i15);
        ListaCeldas.add(ayuda);

        ayuda = findViewById(R.id.a16);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.b16);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.c16);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.d16);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.e16);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.f16);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.g16);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.h16);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.i16);
        ListaCeldas.add(ayuda);

        ayuda = findViewById(R.id.a17);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.b17);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.c17);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.d17);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.e17);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.f17);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.g17);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.h17);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.i17);
        ListaCeldas.add(ayuda);

        ayuda = findViewById(R.id.a18);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.b18);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.c18);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.d18);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.e18);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.f18);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.g18);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.h18);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.i18);
        ListaCeldas.add(ayuda);

        ayuda = findViewById(R.id.a19);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.b19);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.c19);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.d19);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.e19);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.f19);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.g19);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.h19);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.i19);
        ListaCeldas.add(ayuda);

        ayuda = findViewById(R.id.a20);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.b20);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.c20);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.d20);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.e20);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.f20);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.g20);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.h20);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.i20);
        ListaCeldas.add(ayuda);

        ayuda = findViewById(R.id.a21);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.b21);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.c21);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.d21);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.e21);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.f21);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.g21);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.h21);
        ListaCeldas.add(ayuda);
        ayuda = findViewById(R.id.i21);
        ListaCeldas.add(ayuda);
    }

    public void actualizarTablero(int[][] matriz){
        int index = 0;

        for (int i = 3; i<=23; i++){
            for (int j=0;j<=9;j++){
                TextView auxiliar  = ListaCeldas.get(index);
                cambiarColor(matriz[i][j],auxiliar);
            }
        }
    }

    public void cambiarSiguiente(int pieza){
        ImageView aux = (ImageView) findViewById(R.id.siguientePieza);
        String source = "@drawable/imgs/";  // where myresource (without the extension) is the file

        int imageResource = getResources().getIdentifier(source, null, getPackageName());

        switch(pieza){
            case 1:
                source = source + "I";
                        break;
            case 2:
                source = source + "T";
                break;
            case 3:
                source = source + "J";
                break;
            case 4:
                source = source + "L";
                break;
            case 5:
                source = source + "O";
                break;
            case 6:
                source = source + "S";
                break;
            case 7:
                source = source + "Z";
                break;
        }
        Drawable res = getResources().getDrawable(imageResource);
        aux.setImageDrawable(res);
    }

    public void cambiarColor(int color, TextView vista){
        switch(color) {
            case 0:
                vista.setBackgroundColor(0Xffffff);
                break;
            case 1:
                vista.setBackgroundColor(0X00ffff);
                break;
            case 2:
                vista.setBackgroundColor(0Xcc00cc);
                break;
            case 3:
                vista.setBackgroundColor(0X0000ff);
                break;
            case 4:
                vista.setBackgroundColor(0Xff6600);
                break;
            case 5:
                vista.setBackgroundColor(0Xffff00);
                break;
            case 6:
                vista.setBackgroundColor(0X33cc33);
                break;
            case 7:
                vista.setBackgroundColor(0Xff0000);
                break;
        }
    }

}
