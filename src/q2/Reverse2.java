package q2;

/**
 * Q2. 文字列を逆転させなさい。確認する文字列はどんなものでも構いません。
 *
 * <pre>
 * (例)
 * "abcde" => "edcba"
 * "酔いしれ占う仲良いあの娘" => " この愛よ叶うなら嬉しいよ"
 * </pre>
 *
 * メソッドreverseを作成しなさい。
 *
 * @author y.morinaga
 */
public class Reverse2 {

    public static void main(String[] args) {
        String reversed = reverse("よいしれうらなうなかよいあのこ");
        System.out.println(reversed);
    }

	private static String reverse(String string) {
		StringBuilder builder = new StringBuilder(string);
		builder = builder.reverse();
		return builder.toString();
	}

}
