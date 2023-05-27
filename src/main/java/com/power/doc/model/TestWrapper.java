package com.power.doc.model;

public class TestWrapper {

    private final TestA testA = new TestA();

    private final TestB testB = new TestB();

    public void setACode(String aCode){
        testA.setaCode(aCode);
    }
    public void setAName(String aName) {
        testA.setaName(aName);
    }

    public static class TestA {
        private String aName;
        private String aCode;

        public String getaName() {
            return aName;
        }

        public void setaName(String aName) {
            this.aName = aName;
        }

        public String getaCode() {
            return aCode;
        }

        public void setaCode(String aCode) {
            this.aCode = aCode;
        }
    }

    public static class TestB {
        private String bName;
        private String bCode;

        public String getbName() {
            return bName;
        }

        public void setbName(String bName) {
            this.bName = bName;
        }

        public String getbCode() {
            return bCode;
        }

        public void setbCode(String bCode) {
            this.bCode = bCode;
        }
    }



    public TestA getTestA() {
        return testA;
    }

    public TestB getTestB() {
        return testB;
    }
}
