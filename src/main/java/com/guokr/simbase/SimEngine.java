package com.guokr.simbase;

import com.guokr.simbase.events.BasisListener;
import com.guokr.simbase.events.RecommendationListener;
import com.guokr.simbase.events.VectorSetListener;

public interface SimEngine {

    public void load(SimCallback callback);

    public void save(SimCallback callback);

    public void del(SimCallback callback, String key);

    public void bload(SimCallback callback, String key);

    public void bsave(SimCallback callback, String key);

    public void blist(SimCallback callback);

    public void bmk(SimCallback callback, String bkey, String[] base);

    public void brev(SimCallback callback, String bkey, String[] base);

    public void bget(SimCallback callback, String bkey);

    public void vlist(SimCallback callback, String bkey);

    public void vmk(SimCallback callback, String bkey, String vkey);

    public void vids(SimCallback callback, String vkey);

    public void vget(SimCallback callback, String vkey, int vecid);

    public void vadd(SimCallback callback, String vkey, int vecid, float[] vector);

    public void vset(SimCallback callback, String vkey, int vecid, float[] vector);

    public void vacc(SimCallback callback, String vkey, int vecid, float[] vector);

    public void vrem(SimCallback callback, String vkey, int vecid);

    public void iget(SimCallback callback, String vkey, int vecid);

    public void iset(SimCallback callback, String vkey, int vecid, int[] pairs);

    public void iadd(SimCallback callback, String vkey, int vecid, int[] pairs);

    public void iacc(SimCallback callback, String vkey, int vecid, int[] pairs);

    public void rlist(SimCallback callback, String vkey);

    public void rmk(SimCallback callback, String vkeySource, String vkeyTarget, String funcscore);

    public void rget(SimCallback callback, String vkeySource, int vecid, String vkeyTarget);

    public void listen(String bkey, BasisListener listener);

    public void rrec(SimCallback callback, String vkeySource, int vecid, String vkeyTarget);

    public void listen(String vkey, VectorSetListener listener);

    public void listen(String srcVkey, String tgtVkey, RecommendationListener listener);
}