public class NumberofStudentsUnabletoEatLunch {
    public int countStudents(int[] students, int[] sandwiches) {
        int count = 0;
        int stupointer = 0;
        int sandpointer = 0;
        int attemp = 0;

        int stulen = students.length;
        int sanlen = sandwiches.length;

        while (count < stulen) {


            if (students[stupointer] == -1) {
                stupointer = (stupointer + 1) % stulen;
                continue;
            }

            if (students[stupointer] == sandwiches[sandpointer]) {
                attemp = 0;
                count++;
                students[stupointer] = -1;
                sandpointer++;
            }
            stupointer = (stupointer + 1) % stulen;

            attemp++;

            if (stulen == attemp)
                break;
        }
        return stulen - count;
    }
}
