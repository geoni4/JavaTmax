package ch07.ex.ex11;

public class MainActivity extends Activity {
    @Override
    public void onCreate(){
        super.onCreate();
        System.out.println("추가적인 실행 내용");
    }
    
    public static void main(String[] args) {
		MainActivity ma = new MainActivity();
		
		ma.onCreate();
	}
}