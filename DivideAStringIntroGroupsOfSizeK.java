import java.util.ArrayList;
//easy 5980
public class DivideAStringIntroGroupsOfSizeK {
  public static void main(String[] args) {
    divideString("abcdefghi", 3, 'x');
  }

  public static String[] divideString(String s, int k, char fill) {
    char[] c = s.toCharArray();
    int add = 0;

    // first get the c/k and get the reminder
    int reminderFiLL = c.length % k;
    int count = c.length / k + reminderFiLL;
    ArrayList<String> result = new ArrayList<String>();

    String temp = "";
    for (int j = 0; j < c.length; j++) {
      temp += c[j];
      int temp2 = j + 1;
      if (temp2 % k == 0 && count > add) {
        result.add(temp);
        add++;
        temp = "";
      }
    }
    if (temp.isEmpty()) {

    }else{
        char[] charTemp = temp.toCharArray();
        char fillChar = fill;
        for (int i = 0; i < k - charTemp.length; i++) {
            temp += fillChar;
        }
        result.add(temp);
    }


      String[] str = new String[result.size()];
      for (int i = 0; i < str.length; i++) {
          str[i] = result.get(i);
      System.out.println(str[i]);
      }


    return str;
  }
}
