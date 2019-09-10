package com.benben.commoncore.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by caojieting on 2017/12/15.
 */

public class PreferenceProvider {
    private Context context;
    /**
     * 保存在手机里面的文件名
     */
    public final String SP_NAME = "config";
    public final int SP_MODE = Context.MODE_PRIVATE;
    private SharedPreferences sp;
    private static SharedPreferences.Editor editor;

    public PreferenceProvider(Context context) {
        this.context = context;
    }

    public void setPhoto(String photo) {
        SharedPreferences spf = PreferenceManager
                .getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = spf.edit();
        editor.putString("photo", photo);
        editor.commit();
    }

    public String getPhoto() {//头像
        SharedPreferences spf = PreferenceManager
                .getDefaultSharedPreferences(context);
        return spf.getString("photo", "");
    }

    public void setUserName(String username) {
        SharedPreferences spf = PreferenceManager
                .getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = spf.edit();
        editor.putString("username", username);
        editor.commit();

    }

    public String getUserName() {//昵称
        SharedPreferences spf = PreferenceManager
                .getDefaultSharedPreferences(context);
        return spf.getString("username", "");
    }

    public void setLatitude(String username) {//纬度
        SharedPreferences spf = PreferenceManager
                .getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = spf.edit();
        editor.putString("Latitude", username);
        editor.commit();

    }

    public String getLatitude() {
        SharedPreferences spf = PreferenceManager
                .getDefaultSharedPreferences(context);
        return spf.getString("Latitude", "");
    }

    public void setAddress(String address) {//纬度
        SharedPreferences spf = PreferenceManager
                .getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = spf.edit();
        editor.putString("address", address);
        editor.commit();

    }

    public String getAddress() {
        SharedPreferences spf = PreferenceManager
                .getDefaultSharedPreferences(context);
        return spf.getString("address", "");
    }

    public void setLongitude(String username) {//经度
        SharedPreferences spf = PreferenceManager
                .getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = spf.edit();
        editor.putString("Longitude", username);
        editor.commit();

    }

    public String getLongitude() {
        SharedPreferences spf = PreferenceManager
                .getDefaultSharedPreferences(context);
        return spf.getString("Longitude", "");
    }

    public void setId(String id) {
        SharedPreferences spf = PreferenceManager
                .getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = spf.edit();
        editor.putString("id", id);
        editor.commit();

    }

    public String getId() {
        SharedPreferences spf = PreferenceManager
                .getDefaultSharedPreferences(context);
        return spf.getString("id", "");
    }

    public void setUId(String uid) {
        SharedPreferences spf = PreferenceManager
                .getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = spf.edit();
        editor.putString("uid", uid);
        editor.commit();

    }

    public String getUId() {
        SharedPreferences spf = PreferenceManager
                .getDefaultSharedPreferences(context);
        return spf.getString("uid", "");
    }

    public void setUserType(String userType) {
        SharedPreferences spf = PreferenceManager
                .getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = spf.edit();
        editor.putString("userType", userType);
        editor.commit();

    }

    public String getUserType() {
        SharedPreferences spf = PreferenceManager
                .getDefaultSharedPreferences(context);
        return spf.getString("userType","");
    }

    public void setMobile(String mobile) {
        SharedPreferences spf = PreferenceManager
                .getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = spf.edit();
        editor.putString("mobile", mobile);
        editor.commit();

    }

    public String getMobile() {
        SharedPreferences spf = PreferenceManager
                .getDefaultSharedPreferences(context);
        return spf.getString("mobile", "");
    }
    public void setShopId(String shop_id) {
        SharedPreferences spf = PreferenceManager
                .getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = spf.edit();
        editor.putString("shop_id", shop_id);
        editor.commit();

    }
    public void setIdNumber(String id_number) {
        SharedPreferences spf = PreferenceManager
                .getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = spf.edit();
        editor.putString("id_number", id_number);
        editor.commit();

    }

    public String getIdNumber() {
        SharedPreferences spf = PreferenceManager
                .getDefaultSharedPreferences(context);
        return spf.getString("id_number", "");
    }
    public String getShopId() {
        SharedPreferences spf = PreferenceManager
                .getDefaultSharedPreferences(context);
        return spf.getString("shop_id", "");
    }


    public void setPwd(String pwd) {
        SharedPreferences spf = PreferenceManager
                .getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = spf.edit();
        editor.putString("pwd", pwd);
        editor.commit();

    }

    public String getPwd() {
        SharedPreferences spf = PreferenceManager
                .getDefaultSharedPreferences(context);
        return spf.getString("pwd", "");
    }


    public void setToken(String token) {
        SharedPreferences spf = PreferenceManager
                .getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = spf.edit();
        editor.putString("token", token);
        editor.commit();

    }

    public String getToken() {
        SharedPreferences spf = PreferenceManager
                .getDefaultSharedPreferences(context);
        return spf.getString("token", "0");
    }
    //省份
    public void setProvince(String token) {
        SharedPreferences spf = PreferenceManager
                .getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = spf.edit();
        editor.putString("province", token);
        editor.commit();

    }

    public String getProvince() {
        SharedPreferences spf = PreferenceManager
                .getDefaultSharedPreferences(context);
        return spf.getString("province", "");
    }
    //城市
    public void setCity(String token) {
        SharedPreferences spf = PreferenceManager
                .getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = spf.edit();
        editor.putString("city", token);
        editor.commit();

    }

    public String getCity() {
        SharedPreferences spf = PreferenceManager
                .getDefaultSharedPreferences(context);
        return spf.getString("city", "");
    }
    //地区
    public void setDistrict(String token) {
        SharedPreferences spf = PreferenceManager
                .getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = spf.edit();
        editor.putString("district", token);
        editor.commit();

    }

    public String getDistrict() {
        SharedPreferences spf = PreferenceManager
                .getDefaultSharedPreferences(context);
        return spf.getString("district", "");
    }

    //公司名称
    public void setCompanyName(String token) {
        SharedPreferences spf = PreferenceManager
                .getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = spf.edit();
        editor.putString("company_name", token);
        editor.commit();

    }

    public String getCompanyName() {
        SharedPreferences spf = PreferenceManager
                .getDefaultSharedPreferences(context);
        return spf.getString("company_name", "");
    }

    //纳税人识别号
    public void setCompanyCode(String token) {
        SharedPreferences spf = PreferenceManager
                .getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = spf.edit();
        editor.putString("company_code", token);
        editor.commit();

    }

    public String getCompanyCode() {
        SharedPreferences spf = PreferenceManager
                .getDefaultSharedPreferences(context);
        return spf.getString("company_code", "");
    }

    //真实姓名
    public void setRealName(String token) {
        SharedPreferences spf = PreferenceManager
                .getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = spf.edit();
        editor.putString("real_name", token);
        editor.commit();

    }

    public String getRealName() {
        SharedPreferences spf = PreferenceManager
                .getDefaultSharedPreferences(context);
        return spf.getString("real_name", "");
    }

    //联系方式
    public void setRealPhone(String token) {
        SharedPreferences spf = PreferenceManager
                .getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = spf.edit();
        editor.putString("real_phone", token);
        editor.commit();

    }

    public String getRealPhone() {
        SharedPreferences spf = PreferenceManager
                .getDefaultSharedPreferences(context);
        return spf.getString("real_phone", "");
    }

    //收货地址
    public void setRealAddress(String token) {
        SharedPreferences spf = PreferenceManager
                .getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = spf.edit();
        editor.putString("real_address", token);
        editor.commit();

    }

    public String getRealAddress() {
        SharedPreferences spf = PreferenceManager
                .getDefaultSharedPreferences(context);
        return spf.getString("real_address", "");
    }
    //声音通知
    public void setNotifySound(Boolean isClose) {
        SharedPreferences spf = PreferenceManager
                .getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = spf.edit();
        editor.putBoolean("notify_sound", isClose);
        editor.commit();

    }

    public boolean getNotifySound() {
        SharedPreferences spf = PreferenceManager
                .getDefaultSharedPreferences(context);
        return spf.getBoolean("notify_sound", true);
    }
    //震动通知
    public void setNotifyVibrate(Boolean isClose) {
        SharedPreferences spf = PreferenceManager
                .getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = spf.edit();
        editor.putBoolean("notify_vibrate", isClose);
        editor.commit();

    }

    public boolean getNotifyVibrate() {
        SharedPreferences spf = PreferenceManager
                .getDefaultSharedPreferences(context);
        return spf.getBoolean("notify_vibrate", true);
    }
    //开启支付密码
    public void setClosePayPwd(Boolean isClose) {
        SharedPreferences spf = PreferenceManager
                .getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = spf.edit();
        editor.putBoolean("close_pwd", isClose);
        editor.commit();

    }

    public boolean getClosePayPwd() {
        SharedPreferences spf = PreferenceManager
                .getDefaultSharedPreferences(context);
        return spf.getBoolean("close_pwd", true);
    }

    /**
     * 根据类型调用不同的保存方法
     *
     * @param context 上下文
     * @param key     添加的键
     * @param value   添加的值
     * @return 是否添加成功（可以使用apply提交）
     */
    public boolean put(Context context, String key, Object value) {
        if (sp == null) {
            sp = context.getSharedPreferences(SP_NAME, SP_MODE);
        }
        editor = sp.edit();
        if (value == null) {
            editor.putString(key, null);
        } else if (value instanceof String) {
            editor.putString(key, (String) value);
        } else if (value instanceof Integer) {
            editor.putInt(key, (Integer) value);
        } else if (value instanceof Boolean) {
            editor.putBoolean(key, (Boolean) value);
        } else if (value instanceof Float) {
            editor.putFloat(key, (Float) value);
        } else if (value instanceof Long) {
            editor.putLong(key, (Long) value);
        } else {
            editor.putString(key, value.toString());
        }
        return editor.commit();
    }


    public Object get(Context context, String key, Object defaultObject) {
        SharedPreferences sp = context.getSharedPreferences(SP_NAME,
                SP_MODE);

        if (defaultObject instanceof String) {
            return sp.getString(key, (String) defaultObject);
        } else if (defaultObject instanceof Integer) {
            return sp.getInt(key, (Integer) defaultObject);
        } else if (defaultObject instanceof Boolean) {
            return sp.getBoolean(key, (Boolean) defaultObject);
        } else if (defaultObject instanceof Float) {
            return sp.getFloat(key, (Float) defaultObject);
        } else if (defaultObject instanceof Long) {
            return sp.getLong(key, (Long) defaultObject);
        }

        return null;
    }


}
