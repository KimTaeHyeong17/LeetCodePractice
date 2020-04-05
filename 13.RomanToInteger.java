class Solution {
    public int romanToInt(String s) {
        int answer = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i == s.length() - 1) {
                System.out.println(s.charAt(i));
                switch (s.charAt(i)) {
                    case 'I':
                        answer = answer + 1;
                        break;
                    case 'V':
                        answer = answer + 5;
                        break;
                    case 'X':
                        answer = answer + 10;
                        break;
                    case 'L':
                        answer = answer + 50;
                        break;
                    case 'C':
                        answer = answer + 100;
                        break;
                    case 'D':
                        answer = answer + 500;
                        break;
                    case 'M':
                        answer = answer + 1000;
                        break;
                }
                break;
            } else {
                switch (s.charAt(i)) {
                    case 'I':
                        if (s.charAt(i + 1) == 'V') {
                            answer = answer + 4;
                            i++;
                        } else if (s.charAt(i + 1) == 'X') {
                            answer = answer + 9;
                            i++;
                        } else {
                            answer = answer + 1;
                        }
                        break;
                    case 'V':
                        answer = answer + 5;
                        break;
                    case 'X':
                        if (s.charAt(i + 1) == 'L') {
                            answer = answer + 40;
                            i++;
                        } else if (s.charAt(i + 1) == 'C') {
                            answer = answer + 90;
                            i++;
                        } else {
                            answer = answer + 10;
                        }
                        break;
                    case 'L':
                        answer = answer + 50;
                        break;
                    case 'C':
                        if (s.charAt(i + 1) == 'D') {
                            answer = answer + 400;
                            i++;
                        } else if (s.charAt(i + 1) == 'M') {
                            answer = answer + 900;
                            i++;
                        } else {
                            answer = answer + 100;
                        }
                        break;
                    case 'D':
                        answer = answer + 500;
                        break;
                    case 'M':
                        answer = answer + 1000;
                        break;
                }
            }
        }
        return answer;
    }
}
