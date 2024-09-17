//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package io.github.hhy50.linker.jmh.linker;

import io.github.hhy50.linker.define.provider.DefaultTargetProviderImpl;
import io.github.hhy50.linker.runtime.Runtime;
import io.github.hhy50.linker.runtime.RuntimeUtil;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;

public class RuntimeMyArrayList$impl extends DefaultTargetProviderImpl implements RuntimeMyArrayList {
    public Class target_lookup_$_class_type;
    public Class target_$$_add_lookup_$_class_type;
    public MethodHandle target_$$_add_invoker_mh;
    public Class target_$$_clear_lookup_$_class_type;
    public MethodHandle target_$$_clear_invoker_mh;
    public Class target_$$_get_lookup_$_class_type;
    public MethodHandle target_$$_get_invoker_mh;

    public RuntimeMyArrayList$impl(ArrayList var1) {
        super(var1);
    }

    public void add(Object var1) {
        this.invoke_target_$$_add(var1);
    }

    public Object getTarget() {
        try {
            Object var1 = this.target;
            if (this.target_lookup_$_class_type == null) {
                if (var1 == null) {
                    Class var2 = Runtime.getClass(RuntimeMyArrayList$impl.class.getClassLoader(), "java.util.ArrayList");
                    this.target_lookup_$_class_type = var2;
                } else {
                    this.target_lookup_$_class_type = var1.getClass();
                }
            }

            return var1;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void invoke_target_$$_add(Object var1) {
        try {
            Object var2 = this.getTarget();
            if (var2 != null && (this.target_$$_add_lookup_$_class_type == null || var2.getClass() != this.target_$$_add_lookup_$_class_type)) {
                this.target_$$_add_lookup_$_class_type = var2.getClass();
            }

            if (this.target_$$_add_lookup_$_class_type == null) {
                this.target_$$_add_lookup_$_class_type = Runtime.findField(this.target_lookup_$_class_type, "target");
            }

            if (this.target_$$_add_invoker_mh == null) {
                MethodHandles.Lookup var3 = Runtime.lookup(this.target_$$_add_lookup_$_class_type);
                this.target_$$_add_invoker_mh = Runtime.findMethod(var3, var2.getClass(), "add", (String) null, new String[]{"java.lang.Object"});
            }
            this.target_$$_add_invoker_mh.invoke(var2, var1);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void clear() {
        this.invoke_target_$$_clear();
    }

    public void invoke_target_$$_clear() {
        try {
            Object var1 = this.getTarget();
            if (var1 != null && (this.target_$$_clear_lookup_$_class_type == null || var1.getClass() != this.target_$$_clear_lookup_$_class_type)) {
                this.target_$$_clear_lookup_$_class_type = var1.getClass();
            }

            if (this.target_$$_clear_lookup_$_class_type == null) {
                this.target_$$_clear_lookup_$_class_type = Runtime.findField(this.target_lookup_$_class_type, "target");
            }

            if (this.target_$$_clear_invoker_mh == null) {
                MethodHandles.Lookup var2 = Runtime.lookup(this.target_$$_clear_lookup_$_class_type);
                this.target_$$_clear_invoker_mh = Runtime.findMethod(var2, var1.getClass(), "clear", (String) null, new String[0]);
            }

            if (!RuntimeUtil.isStatic(this.target_$$_clear_invoker_mh)) {
                if (var1 == null) {
                    throw new NullPointerException("target[type=java.lang.Object]");
                }

                this.target_$$_clear_invoker_mh.invoke(var1);
            } else {
                this.target_$$_clear_invoker_mh.invoke();
            }
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void get(int var1) {
        this.invoke_target_$$_get(var1);
    }

    public void invoke_target_$$_get(int var1) {
        try {
            Object var2 = this.getTarget();
            if (var2 != null && (this.target_$$_get_lookup_$_class_type == null || var2.getClass() != this.target_$$_get_lookup_$_class_type)) {
                this.target_$$_get_lookup_$_class_type = var2.getClass();
                System.out.println(1234);
            }

            if (this.target_$$_get_lookup_$_class_type == null) {
                this.target_$$_get_lookup_$_class_type = Runtime.findField(this.target_lookup_$_class_type, "target");
                System.out.println(4321);
            }

            if (this.target_$$_get_invoker_mh == null) {
                MethodHandles.Lookup var3 = Runtime.lookup(this.target_$$_get_lookup_$_class_type);
                this.target_$$_get_invoker_mh = Runtime.findMethod(var3, var2.getClass(), "get", (String) null, new String[]{"int"});
                System.out.println(5678);
            }

            if (!RuntimeUtil.isStatic(this.target_$$_get_invoker_mh)) {
                if (var2 == null) {
                    throw new NullPointerException("target[type=java.lang.Object]");
                }

                this.target_$$_get_invoker_mh.invoke(var2, var1);
            } else {
                this.target_$$_get_invoker_mh.invoke(var1);
            }
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
