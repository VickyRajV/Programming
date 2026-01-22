import java.util.*;

public class primeNumberCheck {
        public static List<Integer> MathChallenge(int num) {
            String digits = String.valueOf(num);
            Set<Integer> primes = new TreeSet<>();
            List<String> permutations = new ArrayList<>();

            permute("", digits, permutations);

            for (String perm : permutations) {
                if (perm.charAt(0) == '0') continue;

                int candidate = Integer.parseInt(perm);

                if (isPrime(candidate)) {
                    primes.add(candidate);
                }
            }

            return new ArrayList<>(primes);
        }

        private static void permute(String prefix, String remaining, List<String> result) {
            if (remaining.length() == 0) {
                result.add(prefix);
                return ;
            }
            for (int i = 0; i < remaining.length(); i++) {
                permute(prefix + remaining.charAt(i),
                        remaining.substring(0, i) + remaining.substring(i + 1),
                        result);
            }
        }

        private static boolean isPrime(int n) {
            if (n < 2) return false;
            if (n % 2 == 0 && n != 2) return false;
            for (int i = 3; i * i <= n; i += 2) {
                if (n % i == 0) return false;
            }
            return true;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            List<Integer> result = MathChallenge(num);

            if (result.isEmpty()) {
                System.out.println(" 0");
            } else {
                System.out.println("Prime " + result);
            }

            sc.close();
        }
    }

//
//
//you are gievn an array of distinct integers return all unique permutations os the array where
//1.Each integer from nums can be used at mosttwice in a permutation.
//        2.The length of a permutation must be either:
//        -> exactly n(length of nums ),
//        -> exactly n+1
//example input =
//        nums= [1,2]
//output should be =[[1,2],[2,1],[1,1],[2,2],[1,2,1],[1,2,2],[2,1,1],[2,1,1]]
//
//explanation
//length n = 2 -> [1,2],[2,1],[1,1],[2,2]
