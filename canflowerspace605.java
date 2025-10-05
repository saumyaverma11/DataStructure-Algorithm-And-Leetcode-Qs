//  int len = flowerbed.length;

//         for (int i = 0; i < len && n > 0; i++) {
//             if (flowerbed[i] == 0) {
//                 // Check left and right
//                 boolean leftEmpty = (i == 0) || (flowerbed[i - 1] == 0);
//                 boolean rightEmpty = (i == len - 1) || (flowerbed[i + 1] == 0);

//                 if (leftEmpty && rightEmpty) {
//                     flowerbed[i] = 1;
//                     n--;
//                 }
//             }
//         }

//         return n <= 0;