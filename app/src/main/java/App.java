import com.recipeapp.datahandler.CSVDataHandler;
import com.recipeapp.datahandler.DataHandler;
import com.recipeapp.datahandler.JSONDataHandler;
import com.recipeapp.ui.RecipeUI;
import java.io.*;

public class App {

    public static void main(String[] args) {

        /* ユーザーに表示の仕方を、CSVかJSONを選んでもらう。
         * CSVならcsvDataHandlerのgetModeメソッドをよび、CSVと表示
         * JsonならjsonDataHandlerのgetModeメソッドをよび、Jsonと表示
         * 選ばれたほうの、オブジェクトをRecipeクラスに引数として渡し、
         * displayMenuメソッドを呼び出し、メインメニューを表示
         */
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Choose the file format:");
            System.out.println("1. CSV");
            System.out.println("2. JSON");
            System.out.print("Select (1/2): ");
            String choice = reader.readLine();

            int num = Integer.parseInt(choice);
            switch (num) {
                case 1:
                    DataHandler csvDataHandler =  new CSVDataHandler();
                    RecipeUI recipeUI = new RecipeUI(csvDataHandler);
                    recipeUI.displayMenu();
                    break;
            
                case 2:
                    DataHandler jsonDataHandler = new JSONDataHandler();
                    RecipeUI recipeUI2 = new RecipeUI(jsonDataHandler);
                    recipeUI2.displayMenu();
                    break;

                default:
                    DataHandler csvDataHandler2 = new CSVDataHandler();
                    RecipeUI recipeUI3 = new RecipeUI(csvDataHandler2);
                    recipeUI3.displayMenu();
                    break;
            }
            

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}