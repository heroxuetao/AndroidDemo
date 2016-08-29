package cn.cbapay.demo2;

import java.util.List;

/**
 * Created by xuetao on 16/8/16.
 */
public class Test {


    /**
     * status : 200
     * message : SUCCESS
     * state : 00
     * data : {"cars":[{"car_id":"6","car_user_id":"17","car_card":"鲁22222","car_type":0,"car_length":null,"car_width":null,"car_height":null,"car_weight":null,"car_load":"333","car_color":null,"car_status":0,"car_veracity":0,"car_apply_time":"2016-08-16 15:21:53","car_check_time":null,"car_is_delete":"0","car_license":"222","car_buy_time":null,"car_is_consign":null,"car_picture":"2016081657b2bf1125e57.jpg","car_brand":null,"car_volume":null},{"car_id":"7","car_user_id":"17","car_card":"鲁4444","car_type":0,"car_length":null,"car_width":null,"car_height":null,"car_weight":null,"car_load":"44","car_color":null,"car_status":0,"car_veracity":1,"car_apply_time":"2016-08-16 15:31:39","car_check_time":"2016-08-16 15:47:48","car_is_delete":"0","car_license":"4","car_buy_time":null,"car_is_consign":null,"car_picture":"2016081657b2c15b2ceec.jpg","car_brand":null,"car_volume":null},{"car_id":"8","car_user_id":"17","car_card":"鲁55555","car_type":0,"car_length":null,"car_width":null,"car_height":null,"car_weight":null,"car_load":"555","car_color":null,"car_status":0,"car_veracity":2,"car_apply_time":"2016-08-16 15:37:43","car_check_time":"2016-08-16 15:49:25","car_is_delete":"0","car_license":"122222333","car_buy_time":null,"car_is_consign":null,"car_picture":"2016081657b2c2c75ae3a.","car_brand":null,"car_volume":null},{"car_id":"9","car_user_id":"17","car_card":"鲁66666","car_type":1,"car_length":null,"car_width":null,"car_height":null,"car_weight":null,"car_load":"555","car_color":null,"car_status":0,"car_veracity":0,"car_apply_time":"2016-08-16 15:58:48","car_check_time":null,"car_is_delete":"0","car_license":"1234","car_buy_time":null,"car_is_consign":"2","car_picture":null,"car_brand":null,"car_volume":null}],"count":1}
     */

    private int status;
    private String message;
    private String state;
    /**
     * cars : [{"car_id":"6","car_user_id":"17","car_card":"鲁22222","car_type":0,"car_length":null,"car_width":null,"car_height":null,"car_weight":null,"car_load":"333","car_color":null,"car_status":0,"car_veracity":0,"car_apply_time":"2016-08-16 15:21:53","car_check_time":null,"car_is_delete":"0","car_license":"222","car_buy_time":null,"car_is_consign":null,"car_picture":"2016081657b2bf1125e57.jpg","car_brand":null,"car_volume":null},{"car_id":"7","car_user_id":"17","car_card":"鲁4444","car_type":0,"car_length":null,"car_width":null,"car_height":null,"car_weight":null,"car_load":"44","car_color":null,"car_status":0,"car_veracity":1,"car_apply_time":"2016-08-16 15:31:39","car_check_time":"2016-08-16 15:47:48","car_is_delete":"0","car_license":"4","car_buy_time":null,"car_is_consign":null,"car_picture":"2016081657b2c15b2ceec.jpg","car_brand":null,"car_volume":null},{"car_id":"8","car_user_id":"17","car_card":"鲁55555","car_type":0,"car_length":null,"car_width":null,"car_height":null,"car_weight":null,"car_load":"555","car_color":null,"car_status":0,"car_veracity":2,"car_apply_time":"2016-08-16 15:37:43","car_check_time":"2016-08-16 15:49:25","car_is_delete":"0","car_license":"122222333","car_buy_time":null,"car_is_consign":null,"car_picture":"2016081657b2c2c75ae3a.","car_brand":null,"car_volume":null},{"car_id":"9","car_user_id":"17","car_card":"鲁66666","car_type":1,"car_length":null,"car_width":null,"car_height":null,"car_weight":null,"car_load":"555","car_color":null,"car_status":0,"car_veracity":0,"car_apply_time":"2016-08-16 15:58:48","car_check_time":null,"car_is_delete":"0","car_license":"1234","car_buy_time":null,"car_is_consign":"2","car_picture":null,"car_brand":null,"car_volume":null}]
     * count : 1
     */

    private DataEntity data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public DataEntity getData() {
        return data;
    }

    public void setData(DataEntity data) {
        this.data = data;
    }

    public static class DataEntity {
        private int count;
        /**
         * car_id : 6
         * car_user_id : 17
         * car_card : 鲁22222
         * car_type : 0
         * car_length : null
         * car_width : null
         * car_height : null
         * car_weight : null
         * car_load : 333
         * car_color : null
         * car_status : 0
         * car_veracity : 0
         * car_apply_time : 2016-08-16 15:21:53
         * car_check_time : null
         * car_is_delete : 0
         * car_license : 222
         * car_buy_time : null
         * car_is_consign : null
         * car_picture : 2016081657b2bf1125e57.jpg
         * car_brand : null
         * car_volume : null
         */

        private List<CarsEntity> cars;

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public List<CarsEntity> getCars() {
            return cars;
        }

        public void setCars(List<CarsEntity> cars) {
            this.cars = cars;
        }

        public static class CarsEntity {
            private String car_id;
            private String car_user_id;
            private String car_card;
            private int car_type;
            private Object car_length;
            private Object car_width;
            private Object car_height;
            private Object car_weight;
            private String car_load;
            private Object car_color;
            private int car_status;
            private int car_veracity;
            private String car_apply_time;
            private Object car_check_time;
            private String car_is_delete;
            private String car_license;
            private Object car_buy_time;
            private Object car_is_consign;
            private String car_picture;
            private Object car_brand;
            private Object car_volume;

            public String getCar_id() {
                return car_id;
            }

            public void setCar_id(String car_id) {
                this.car_id = car_id;
            }

            public String getCar_user_id() {
                return car_user_id;
            }

            public void setCar_user_id(String car_user_id) {
                this.car_user_id = car_user_id;
            }

            public String getCar_card() {
                return car_card;
            }

            public void setCar_card(String car_card) {
                this.car_card = car_card;
            }

            public int getCar_type() {
                return car_type;
            }

            public void setCar_type(int car_type) {
                this.car_type = car_type;
            }

            public Object getCar_length() {
                return car_length;
            }

            public void setCar_length(Object car_length) {
                this.car_length = car_length;
            }

            public Object getCar_width() {
                return car_width;
            }

            public void setCar_width(Object car_width) {
                this.car_width = car_width;
            }

            public Object getCar_height() {
                return car_height;
            }

            public void setCar_height(Object car_height) {
                this.car_height = car_height;
            }

            public Object getCar_weight() {
                return car_weight;
            }

            public void setCar_weight(Object car_weight) {
                this.car_weight = car_weight;
            }

            public String getCar_load() {
                return car_load;
            }

            public void setCar_load(String car_load) {
                this.car_load = car_load;
            }

            public Object getCar_color() {
                return car_color;
            }

            public void setCar_color(Object car_color) {
                this.car_color = car_color;
            }

            public int getCar_status() {
                return car_status;
            }

            public void setCar_status(int car_status) {
                this.car_status = car_status;
            }

            public int getCar_veracity() {
                return car_veracity;
            }

            public void setCar_veracity(int car_veracity) {
                this.car_veracity = car_veracity;
            }

            public String getCar_apply_time() {
                return car_apply_time;
            }

            public void setCar_apply_time(String car_apply_time) {
                this.car_apply_time = car_apply_time;
            }

            public Object getCar_check_time() {
                return car_check_time;
            }

            public void setCar_check_time(Object car_check_time) {
                this.car_check_time = car_check_time;
            }

            public String getCar_is_delete() {
                return car_is_delete;
            }

            public void setCar_is_delete(String car_is_delete) {
                this.car_is_delete = car_is_delete;
            }

            public String getCar_license() {
                return car_license;
            }

            public void setCar_license(String car_license) {
                this.car_license = car_license;
            }

            public Object getCar_buy_time() {
                return car_buy_time;
            }

            public void setCar_buy_time(Object car_buy_time) {
                this.car_buy_time = car_buy_time;
            }

            public Object getCar_is_consign() {
                return car_is_consign;
            }

            public void setCar_is_consign(Object car_is_consign) {
                this.car_is_consign = car_is_consign;
            }

            public String getCar_picture() {
                return car_picture;
            }

            public void setCar_picture(String car_picture) {
                this.car_picture = car_picture;
            }

            public Object getCar_brand() {
                return car_brand;
            }

            public void setCar_brand(Object car_brand) {
                this.car_brand = car_brand;
            }

            public Object getCar_volume() {
                return car_volume;
            }

            public void setCar_volume(Object car_volume) {
                this.car_volume = car_volume;
            }
        }
    }
}
