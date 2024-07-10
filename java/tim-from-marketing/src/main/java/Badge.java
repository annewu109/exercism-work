class Badge {
    public String print(Integer id, String name, String department) {
        String outStr = "";

        if (id != null) { //id num
            outStr = "[" + id + "] - ";
        }

        //name
        outStr = outStr + name + " - ";

        //department
        if (department != null) {
            outStr = outStr + department.toUpperCase();
        }
        else {
            outStr = outStr + "OWNER";
        }

        return outStr;
    }
}
