import java.lang.invoke.StringConcatFactory;
import java.util.Arrays;
import java.util.List;

public class Streamy {
    public static void main(String []args) {
        String bruh = ("90859\n" +
                "127415\n" +
                "52948\n" +
                "92106\n" +
                "106899\n" +
                "72189\n" +
                "60084\n" +
                "79642\n" +
                "138828\n" +
                "103609\n" +
                "149073\n" +
                "127749\n" +
                "86976\n" +
                "104261\n" +
                "139341\n" +
                "81414\n" +
                "102622\n" +
                "131030\n" +
                "120878\n" +
                "96809\n" +
                "130331\n" +
                "119212\n" +
                "52317\n" +
                "108990\n" +
                "136871\n" +
                "67279\n" +
                "76541\n" +
                "113254\n" +
                "77739\n" +
                "75027\n" +
                "53863\n" +
                "97732\n" +
                "65646\n" +
                "87851\n" +
                "63712\n" +
                "92660\n" +
                "131821\n" +
                "127837\n" +
                "52363\n" +
                "70349\n" +
                "66110\n" +
                "132249\n" +
                "50319\n" +
                "125948\n" +
                "98360\n" +
                "137675\n" +
                "61957\n" +
                "143540\n" +
                "137402\n" +
                "135774\n" +
                "51376\n" +
                "144833\n" +
                "118646\n" +
                "128136\n" +
                "141140\n" +
                "82856\n" +
                "63345\n" +
                "143617\n" +
                "79733\n" +
                "73449\n" +
                "116126\n" +
                "73591\n" +
                "63899\n" +
                "110409\n" +
                "79602\n" +
                "77485\n" +
                "64050\n" +
                "131760\n" +
                "90509\n" +
                "112728\n" +
                "55181\n" +
                "55329\n" +
                "98597\n" +
                "126579\n" +
                "108227\n" +
                "80707\n" +
                "92962\n" +
                "90396\n" +
                "123775\n" +
                "125248\n" +
                "128814\n" +
                "64593\n" +
                "63108\n" +
                "76486\n" +
                "107135\n" +
                "111064\n" +
                "142569\n" +
                "68579\n" +
                "149006\n" +
                "52258\n" +
                "143477\n" +
                "131889\n" +
                "142506\n" +
                "146732\n" +
                "58663\n" +
                "92013\n" +
                "62410\n" +
                "71035\n" +
                "51208\n" +
                "66372\n");

        String[] foo = bruh.split("\n");

      int idk =  Arrays.stream(foo)
                .mapToInt(Integer::parseInt)
                .map(x-> (int) (Math.floor(x/3)) - 2)
                .sum();
        System.out.println(idk);
    }
}
