package com.bhl.hotfixsample;

import android.app.Application;
import android.content.Context;
import android.os.Environment;
import android.util.Log;

import cn.jiajixin.nuwa.Nuwa;

/**
 * 项目名称：HotFixSample
 * 类描述：
 * 创建人：Cheney
 * 创建时间：2016-04-08 3:42
 * 修改人：Cheney
 * 修改时间：2016-04-08 3:42
 * 修改备注：
 */
public class HotFixApplication extends Application{

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        //初始化Nuwa
        Nuwa.init(this);
        //内部已经判断File是否存在，就不用再判断了
        Nuwa.loadPatch(this, Environment.getExternalStorageDirectory().getAbsolutePath().concat("/patch.jar"));
        Log.d("Cheney", getFilesDir().getAbsolutePath());
    }
}
