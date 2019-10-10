package com.kaider.my_library;

import android.content.Context;
import android.widget.Toast;

/**
 * @author： KaiDer
 * @date： 2019/10/10 9:40
 * @description:
 * @email： 2024468244@qq.com
 */
public class ToastUtils {

    public static void toastLong(Context context, String msg) {
        Toast.makeText(context, msg + "", Toast.LENGTH_LONG).show();
    }

}
