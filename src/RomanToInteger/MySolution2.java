package RomanToInteger;

class MySolution2 {
    public int romanToInt(String s) {
        int result = 0;
        //儲存羅馬數字與值對照表
        Map <Character, Integer> charValueMap = new HashMap<> ();
        charValueMap.put('I', 1);
        charValueMap.put('V', 5);
        charValueMap.put('X', 10);
        charValueMap.put('L', 50);
        charValueMap.put('C', 100);
        charValueMap.put('D', 500);
        charValueMap.put('M', 1000);

        int value;
        for (int i = 0; i < s.length(); i++)
        {
            value = charValueMap.get(s.charAt(i));
            if ( i+1 < s.length() && value < charValueMap.get(s.charAt(i+1))) {
                result -= value;
            }
            else {
                result += value;
            }
        }
        return result;
    }
}
