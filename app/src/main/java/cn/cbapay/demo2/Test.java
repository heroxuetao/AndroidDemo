package cn.cbapay.demo2;

import java.util.List;

/**
 * Created by xuetao on 16/8/16.
 */
public class Test {


    /**
     * pnrInfo : {"fuelTax":0,"passengers":[{"identityNo":"220723199005137706","identityType":"1","name":"宫辰琳","type":0},{"identityNo":"220723199005137706","identityType":"1","name":"宫辰琳2","type":0}],"airportTax":50,"parPrice":1240,"segments":[{"flightNo":"MU5158","arrCode":"SHA","depTime":"0730","seatClass":"Y","planeModel":"333","arrTime":"0940","depDate":"2017-05-20","depCode":"PEK"}]}
     * linkPhone : 18765281631
     * policyId : 190060414
     * linkMan : 宫辰琳
     */

    private PnrInfoEntity pnrInfo;
    private String linkPhone;
    private String policyId;
    private String linkMan;

    public PnrInfoEntity getPnrInfo() {
        return pnrInfo;
    }

    public void setPnrInfo(PnrInfoEntity pnrInfo) {
        this.pnrInfo = pnrInfo;
    }

    public String getLinkPhone() {
        return linkPhone;
    }

    public void setLinkPhone(String linkPhone) {
        this.linkPhone = linkPhone;
    }

    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public String getLinkMan() {
        return linkMan;
    }

    public void setLinkMan(String linkMan) {
        this.linkMan = linkMan;
    }

    public static class PnrInfoEntity {
        /**
         * fuelTax : 0
         * passengers : [{"identityNo":"220723199005137706","identityType":"1","name":"宫辰琳","type":0},{"identityNo":"220723199005137706","identityType":"1","name":"宫辰琳2","type":0}]
         * airportTax : 50
         * parPrice : 1240
         * segments : [{"flightNo":"MU5158","arrCode":"SHA","depTime":"0730","seatClass":"Y","planeModel":"333","arrTime":"0940","depDate":"2017-05-20","depCode":"PEK"}]
         */

        private int fuelTax;
        private int airportTax;
        private int parPrice;
        private List<PassengersEntity> passengers;
        private List<SegmentsEntity> segments;

        public int getFuelTax() {
            return fuelTax;
        }

        public void setFuelTax(int fuelTax) {
            this.fuelTax = fuelTax;
        }

        public int getAirportTax() {
            return airportTax;
        }

        public void setAirportTax(int airportTax) {
            this.airportTax = airportTax;
        }

        public int getParPrice() {
            return parPrice;
        }

        public void setParPrice(int parPrice) {
            this.parPrice = parPrice;
        }

        public List<PassengersEntity> getPassengers() {
            return passengers;
        }

        public void setPassengers(List<PassengersEntity> passengers) {
            this.passengers = passengers;
        }

        public List<SegmentsEntity> getSegments() {
            return segments;
        }

        public void setSegments(List<SegmentsEntity> segments) {
            this.segments = segments;
        }

        public static class PassengersEntity {
            /**
             * identityNo : 220723199005137706
             * identityType : 1
             * name : 宫辰琳
             * type : 0
             */

            private String identityNo;
            private String identityType;
            private String name;
            private int type;

            public String getIdentityNo() {
                return identityNo;
            }

            public void setIdentityNo(String identityNo) {
                this.identityNo = identityNo;
            }

            public String getIdentityType() {
                return identityType;
            }

            public void setIdentityType(String identityType) {
                this.identityType = identityType;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }
        }

        public static class SegmentsEntity {
            /**
             * flightNo : MU5158
             * arrCode : SHA
             * depTime : 0730
             * seatClass : Y
             * planeModel : 333
             * arrTime : 0940
             * depDate : 2017-05-20
             * depCode : PEK
             */

            private String flightNo;
            private String arrCode;
            private String depTime;
            private String seatClass;
            private String planeModel;
            private String arrTime;
            private String depDate;
            private String depCode;

            public String getFlightNo() {
                return flightNo;
            }

            public void setFlightNo(String flightNo) {
                this.flightNo = flightNo;
            }

            public String getArrCode() {
                return arrCode;
            }

            public void setArrCode(String arrCode) {
                this.arrCode = arrCode;
            }

            public String getDepTime() {
                return depTime;
            }

            public void setDepTime(String depTime) {
                this.depTime = depTime;
            }

            public String getSeatClass() {
                return seatClass;
            }

            public void setSeatClass(String seatClass) {
                this.seatClass = seatClass;
            }

            public String getPlaneModel() {
                return planeModel;
            }

            public void setPlaneModel(String planeModel) {
                this.planeModel = planeModel;
            }

            public String getArrTime() {
                return arrTime;
            }

            public void setArrTime(String arrTime) {
                this.arrTime = arrTime;
            }

            public String getDepDate() {
                return depDate;
            }

            public void setDepDate(String depDate) {
                this.depDate = depDate;
            }

            public String getDepCode() {
                return depCode;
            }

            public void setDepCode(String depCode) {
                this.depCode = depCode;
            }
        }
    }
}
