public class StudentAttendanceRecord {

    public boolean checkRecord(String s) {

        int absent = 0;
        int late = 0;
        for(int i=0; i < s.length(); i++) {

            if(absent > 1 || late > 2)
                return false;
            else if(s.charAt(i) =='A') {
                absent++;
                late = 0;
            }

            else if(s.charAt(i) =='L') {
                late++;
            }
            else {
                late = 0;
            }
        }
        return late > 2 || absent > 1 ? false : true;
    }
}
