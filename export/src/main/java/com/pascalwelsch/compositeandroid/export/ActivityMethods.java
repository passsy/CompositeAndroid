package com.pascalwelsch.compositeandroid.export;

import com.fasterxml.jackson.databind.ObjectMapper;

import android.annotation.TargetApi;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;

import java.lang.reflect.Method;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ActivityMethods {

    @TargetApi(Build.VERSION_CODES.KITKAT)
    public static void main(String[] args) throws Exception {

        final List<Object> methodList = new ArrayList<>();
        final List<Method> methods = Arrays.asList(AppCompatActivity.class.getMethods());
        for (final Method method : methods) {
            final HashMap<String, Object> out = new HashMap<>();
            out.put("name", method.getName());
            out.put("returnType", method.getReturnType());
            out.put("annotations", method.getAnnotations());
            final ArrayList<String> params = new ArrayList<>();
            for (final TypeVariable<Method> arg : method.getTypeParameters()) {
                params.add(arg.getName());
            }
            out.put("parameters", params);

            methodList.add(out);
        }

        final ObjectMapper mapper = new ObjectMapper();
        final String json = mapper.writeValueAsString(methodList);
        /*final Gson gson = new Gson();
        Type type = new TypeToken<List<Method>>() {
        }.getType();
        final String json = gson.toJson(methods, type);*/
        System.out.println(json);

        /*for (final Method method : methods) {
            System.out.println("name: " + method.getName());
            System.out.println("annotations: " + method.getAnnotations());
            System.out.println("return: " + method.getReturnType());
            System.out.println("");
        }*/

    }

}
