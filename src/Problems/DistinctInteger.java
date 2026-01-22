package Problems;

import java.util.*;

public class DistinctInteger {

        public static List<List<Integer>> generatePermutations(int[] nums) {
            List<List<Integer>> result = new ArrayList<>();
            Map<Integer, Integer> countMap = new HashMap<>();

            for (int num : nums) {
                countMap.put(num, 2);
            }
            Set<String> seenPrefixes = new HashSet<>();
            backtrack(nums, countMap, new ArrayList<>(), result, nums.length, nums.length + 1, seenPrefixes);

            return result;
        }

        private static void backtrack(int[] nums, Map<Integer, Integer> countMap,
                                      List<Integer> current, List<List<Integer>> result,
                                      int len1, int len2, Set<String> seenPrefixes) {

            if (current.size() == len1 || current.size() == len2) {
                String prefixKey = current.toString();
                boolean skip = false;

                for (String s : seenPrefixes) {
                    if (prefixKey.startsWith(s)) {
                        skip = true;
                        break;
                    }
                }

                if (!skip) {
                    result.add(new ArrayList<>(current));
                    seenPrefixes.add(prefixKey);
                }

                if (current.size() == len2) return;
            }

            for (int num : nums) {
                if (countMap.get(num) > 0) {
                    countMap.put(num, countMap.get(num) - 1);
                    current.add(num);

                    backtrack(nums, countMap, current, result, len1, len2, seenPrefixes);

                    current.remove(current.size() - 1);
                    countMap.put(num, countMap.get(num) + 1);
                }
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter size of array: ");
            int n = sc.nextInt();
            int[] nums = new int[n];

            System.out.println("Enter elements of array: ");
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }
            List<List<Integer>> result = generatePermutations(nums);

            System.out.println(result);
        }
    }
