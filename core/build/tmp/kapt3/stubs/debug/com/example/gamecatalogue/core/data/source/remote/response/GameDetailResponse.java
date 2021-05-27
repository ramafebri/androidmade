package com.example.gamecatalogue.core.data.source.remote.response;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0087\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0003\b\u0081\u0001\b\u0086\b\u0018\u00002\u00020\u0001B\u00bd\u0005\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0012\b\u0002\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\u0012\b\u0002\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\u0012\b\u0002\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0012\b\u0002\u0010\u0015\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u001a\u001a\u00020\b\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u001d\u001a\u00020\b\u0012\u0012\b\u0002\u0010\u001e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0018\u00010\u0005\u0012\u0006\u0010 \u001a\u00020\b\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010$\u001a\u00020\b\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\'\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\b\u0012\u0012\b\u0002\u0010,\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0005\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0001\u0012\u0012\b\u0002\u0010/\u001a\f\u0012\u0006\u0012\u0004\u0018\u000100\u0018\u00010\u0005\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0003\u0012\u0012\b\u0002\u00102\u001a\f\u0012\u0006\u0012\u0004\u0018\u000103\u0018\u00010\u0005\u0012\u0012\b\u0002\u00104\u001a\f\u0012\u0006\u0012\u0004\u0018\u000105\u0018\u00010\u0005\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u000108\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010<\u001a\u00020\b\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u0003\u0012\u0012\b\u0002\u0010>\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010?\u0018\u00010\u0005\u0012\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010C\u001a\u0004\u0018\u00010D\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010F\u001a\u0004\u0018\u00010G\u0012\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\u0002\u0010IJ\u0011\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010KJ\u0014\u0010\u008d\u0001\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u0005H\u00c6\u0003J\u0011\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010KJ\n\u0010\u008f\u0001\u001a\u00020\u0003H\u00c6\u0003J\u0014\u0010\u0090\u0001\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0018\u00010\u0005H\u00c6\u0003J\f\u0010\u0091\u0001\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\n\u0010\u0092\u0001\u001a\u00020\u0003H\u00c6\u0003J\f\u0010\u0093\u0001\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\n\u0010\u0094\u0001\u001a\u00020\bH\u00c6\u0003J\u0011\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010KJ\u0011\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010KJ\u0014\u0010\u0097\u0001\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005H\u00c6\u0003J\n\u0010\u0098\u0001\u001a\u00020\bH\u00c6\u0003J\u0014\u0010\u0099\u0001\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0018\u00010\u0005H\u00c6\u0003J\n\u0010\u009a\u0001\u001a\u00020\bH\u00c6\u0003J\u0012\u0010\u009b\u0001\u001a\u0004\u0018\u00010\"H\u00c6\u0003\u00a2\u0006\u0003\u0010\u0085\u0001J\f\u0010\u009c\u0001\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\n\u0010\u009d\u0001\u001a\u00020\bH\u00c6\u0003J\f\u0010\u009e\u0001\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\f\u0010\u009f\u0001\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\f\u0010\u00a0\u0001\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u0011\u0010\u00a1\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010KJ\f\u0010\u00a2\u0001\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u0011\u0010\u00a3\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010KJ\f\u0010\u00a4\u0001\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\f\u0010\u00a5\u0001\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u0014\u0010\u00a6\u0001\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0005H\u00c6\u0003J\u0011\u0010\u00a7\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010KJ\f\u0010\u00a8\u0001\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u0014\u0010\u00a9\u0001\u001a\f\u0012\u0006\u0012\u0004\u0018\u000100\u0018\u00010\u0005H\u00c6\u0003J\u0011\u0010\u00aa\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010KJ\u0014\u0010\u00ab\u0001\u001a\f\u0012\u0006\u0012\u0004\u0018\u000103\u0018\u00010\u0005H\u00c6\u0003J\u0014\u0010\u00ac\u0001\u001a\f\u0012\u0006\u0012\u0004\u0018\u000105\u0018\u00010\u0005H\u00c6\u0003J\n\u0010\u00ad\u0001\u001a\u00020\nH\u00c6\u0003J\f\u0010\u00ae\u0001\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\f\u0010\u00af\u0001\u001a\u0004\u0018\u000108H\u00c6\u0003J\f\u0010\u00b0\u0001\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u0011\u0010\u00b1\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010KJ\u0011\u0010\u00b2\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010KJ\n\u0010\u00b3\u0001\u001a\u00020\bH\u00c6\u0003J\u0011\u0010\u00b4\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010KJ\u0014\u0010\u00b5\u0001\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010?\u0018\u00010\u0005H\u00c6\u0003J\u0011\u0010\u00b6\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010KJ\u0011\u0010\u00b7\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010KJ\u0011\u0010\u00b8\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010KJ\f\u0010\u00b9\u0001\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\f\u0010\u00ba\u0001\u001a\u0004\u0018\u00010DH\u00c6\u0003J\u0011\u0010\u00bb\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010KJ\f\u0010\u00bc\u0001\u001a\u0004\u0018\u00010GH\u00c6\u0003J\f\u0010\u00bd\u0001\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u0011\u0010\u00be\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010KJ\u0014\u0010\u00bf\u0001\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\u0005H\u00c6\u0003J\u0011\u0010\u00c0\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010KJ\u0011\u0010\u00c1\u0001\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010KJ\u00d8\u0005\u0010\u00c2\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\u0012\b\u0002\u0010\u0015\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0018\u00010\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0018\u001a\u00020\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u001a\u001a\u00020\b2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001d\u001a\u00020\b2\u0012\b\u0002\u0010\u001e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0018\u00010\u00052\b\b\u0002\u0010 \u001a\u00020\b2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010$\u001a\u00020\b2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\'\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\b2\u0012\b\u0002\u0010,\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00052\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00012\u0012\b\u0002\u0010/\u001a\f\u0012\u0006\u0012\u0004\u0018\u000100\u0018\u00010\u00052\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00032\u0012\b\u0002\u00102\u001a\f\u0012\u0006\u0012\u0004\u0018\u000103\u0018\u00010\u00052\u0012\b\u0002\u00104\u001a\f\u0012\u0006\u0012\u0004\u0018\u000105\u0018\u00010\u00052\n\b\u0002\u00106\u001a\u0004\u0018\u00010\b2\n\b\u0002\u00107\u001a\u0004\u0018\u0001082\n\b\u0002\u00109\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010<\u001a\u00020\b2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010>\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010?\u0018\u00010\u00052\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010C\u001a\u0004\u0018\u00010D2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010F\u001a\u0004\u0018\u00010G2\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u0001H\u00c6\u0001\u00a2\u0006\u0003\u0010\u00c3\u0001J\u0015\u0010\u00c4\u0001\u001a\u00020\"2\t\u0010\u00c5\u0001\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\n\u0010\u00c6\u0001\u001a\u00020\u0003H\u00d6\u0001J\n\u0010\u00c7\u0001\u001a\u00020\bH\u00d6\u0001R\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010L\u001a\u0004\bJ\u0010KR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010L\u001a\u0004\bM\u0010KR\u0018\u00107\u001a\u0004\u0018\u0001088\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bN\u0010OR\u001a\u0010@\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010L\u001a\u0004\bP\u0010KR \u0010,\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bQ\u0010RR\u0016\u0010 \u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bS\u0010TR\u0018\u0010B\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bU\u0010TR\u0018\u0010H\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bV\u0010WR\u001a\u00101\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010L\u001a\u0004\bX\u0010KR\u0018\u0010*\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bY\u0010TR\u0016\u0010\u001d\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bZ\u0010TR \u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b[\u0010RR\u0018\u0010#\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\\\u0010TR\u0018\u0010C\u001a\u0004\u0018\u00010D8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b]\u0010^R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010L\u001a\u0004\b_\u0010KR \u00104\u001a\f\u0012\u0006\u0012\u0004\u0018\u000105\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b`\u0010RR\u0016\u0010\u0014\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\ba\u0010bR\u001a\u0010)\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010L\u001a\u0004\bc\u0010KR \u0010/\u001a\f\u0012\u0006\u0012\u0004\u0018\u000100\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bd\u0010RR\u0018\u0010+\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\be\u0010TR\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010L\u001a\u0004\bf\u0010KR\u0016\u0010$\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bg\u0010TR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bh\u0010TR\u001a\u0010;\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010L\u001a\u0004\bi\u0010KR \u0010\u0015\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bj\u0010RR\u001a\u0010-\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010L\u001a\u0004\bk\u0010KR \u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bl\u0010RR\u001a\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010L\u001a\u0004\bm\u0010KR \u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bn\u0010RR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bo\u0010pR\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010L\u001a\u0004\bq\u0010KR \u00102\u001a\f\u0012\u0006\u0012\u0004\u0018\u000103\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\br\u0010RR\u0016\u0010\u0018\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bs\u0010bR\u0018\u0010F\u001a\u0004\u0018\u00010G8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bt\u0010uR\u001a\u0010:\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010L\u001a\u0004\bv\u0010KR\u0018\u0010%\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bw\u0010TR\u0018\u0010&\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bx\u0010TR\u0018\u0010\u0017\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\by\u0010TR\u0018\u00109\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bz\u0010TR\u0016\u0010\u001a\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b{\u0010TR\u001a\u0010(\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010L\u001a\u0004\b|\u0010KR\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010L\u001a\u0004\b}\u0010KR\u0018\u00106\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b~\u0010TR\u001a\u0010E\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010L\u001a\u0004\b\u007f\u0010KR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0080\u0001\u0010TR!\u0010>\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010?\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0081\u0001\u0010RR\u001b\u0010=\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000b\n\u0002\u0010L\u001a\u0005\b\u0082\u0001\u0010KR!\u0010\u001e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0083\u0001\u0010RR\u001d\u0010!\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004\u00a2\u0006\r\n\u0003\u0010\u0086\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001b\u0010A\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000b\n\u0002\u0010L\u001a\u0005\b\u0087\u0001\u0010KR\u0019\u0010\'\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0088\u0001\u0010TR\u0019\u0010.\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0089\u0001\u0010WR\u0017\u0010<\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\t\n\u0000\u001a\u0005\b\u008a\u0001\u0010TR\u001b\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u000b\n\u0002\u0010L\u001a\u0005\b\u008b\u0001\u0010K\u00a8\u0006\u00c8\u0001"}, d2 = {"Lcom/example/gamecatalogue/core/data/source/remote/response/GameDetailResponse;", "", "added", "", "developers", "", "Lcom/example/gamecatalogue/core/data/source/remote/response/DevelopersItem;", "nameOriginal", "", "rating", "", "gameSeriesCount", "playtime", "platforms", "Lcom/example/gamecatalogue/core/data/source/remote/response/PlatformsItem;", "ratingTop", "reviewsTextCount", "publishers", "Lcom/example/gamecatalogue/core/data/source/remote/response/PublishersItem;", "achievementsCount", "id", "parentPlatforms", "Lcom/example/gamecatalogue/core/data/source/remote/response/ParentPlatformsItem;", "redditName", "ratingsCount", "slug", "released", "youtubeCount", "moviesCount", "descriptionRaw", "tags", "Lcom/example/gamecatalogue/core/data/source/remote/response/TagsItem;", "backgroundImage", "tba", "", "dominantColor", "name", "redditDescription", "redditLogo", "updated", "reviewsCount", "metacritic", "description", "metacriticUrl", "alternativeNames", "parentsCount", "userGame", "metacriticPlatforms", "Lcom/example/gamecatalogue/core/data/source/remote/response/MetacriticPlatformsItem;", "creatorsCount", "ratings", "Lcom/example/gamecatalogue/core/data/source/remote/response/RatingsItem;", "genres", "Lcom/example/gamecatalogue/core/data/source/remote/response/GenresItem;", "saturatedColor", "addedByStatus", "Lcom/example/gamecatalogue/core/data/source/remote/response/AddedByStatus;", "redditUrl", "redditCount", "parentAchievementsCount", "website", "suggestionsCount", "stores", "Lcom/example/gamecatalogue/core/data/source/remote/response/StoresItem;", "additionsCount", "twitchCount", "backgroundImageAdditional", "esrbRating", "Lcom/example/gamecatalogue/core/data/source/remote/response/EsrbRating;", "screenshotsCount", "reactions", "Lcom/example/gamecatalogue/core/data/source/remote/response/Reactions;", "clip", "(Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;DLjava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;ILjava/util/List;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Object;Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/example/gamecatalogue/core/data/source/remote/response/AddedByStatus;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lcom/example/gamecatalogue/core/data/source/remote/response/EsrbRating;Ljava/lang/Integer;Lcom/example/gamecatalogue/core/data/source/remote/response/Reactions;Ljava/lang/Object;)V", "getAchievementsCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAdded", "getAddedByStatus", "()Lcom/example/gamecatalogue/core/data/source/remote/response/AddedByStatus;", "getAdditionsCount", "getAlternativeNames", "()Ljava/util/List;", "getBackgroundImage", "()Ljava/lang/String;", "getBackgroundImageAdditional", "getClip", "()Ljava/lang/Object;", "getCreatorsCount", "getDescription", "getDescriptionRaw", "getDevelopers", "getDominantColor", "getEsrbRating", "()Lcom/example/gamecatalogue/core/data/source/remote/response/EsrbRating;", "getGameSeriesCount", "getGenres", "getId", "()I", "getMetacritic", "getMetacriticPlatforms", "getMetacriticUrl", "getMoviesCount", "getName", "getNameOriginal", "getParentAchievementsCount", "getParentPlatforms", "getParentsCount", "getPlatforms", "getPlaytime", "getPublishers", "getRating", "()D", "getRatingTop", "getRatings", "getRatingsCount", "getReactions", "()Lcom/example/gamecatalogue/core/data/source/remote/response/Reactions;", "getRedditCount", "getRedditDescription", "getRedditLogo", "getRedditName", "getRedditUrl", "getReleased", "getReviewsCount", "getReviewsTextCount", "getSaturatedColor", "getScreenshotsCount", "getSlug", "getStores", "getSuggestionsCount", "getTags", "getTba", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTwitchCount", "getUpdated", "getUserGame", "getWebsite", "getYoutubeCount", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component5", "component50", "component51", "component52", "component53", "component54", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;DLjava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;ILjava/util/List;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Object;Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/example/gamecatalogue/core/data/source/remote/response/AddedByStatus;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lcom/example/gamecatalogue/core/data/source/remote/response/EsrbRating;Ljava/lang/Integer;Lcom/example/gamecatalogue/core/data/source/remote/response/Reactions;Ljava/lang/Object;)Lcom/example/gamecatalogue/core/data/source/remote/response/GameDetailResponse;", "equals", "other", "hashCode", "toString", "core_debug"})
public final class GameDetailResponse {
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "added")
    private final java.lang.Integer added = null;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "developers")
    private final java.util.List<com.example.gamecatalogue.core.data.source.remote.response.DevelopersItem> developers = null;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "name_original")
    private final java.lang.String nameOriginal = null;
    @com.google.gson.annotations.SerializedName(value = "rating")
    private final double rating = 0.0;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "game_series_count")
    private final java.lang.Integer gameSeriesCount = null;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "playtime")
    private final java.lang.Integer playtime = null;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "platforms")
    private final java.util.List<com.example.gamecatalogue.core.data.source.remote.response.PlatformsItem> platforms = null;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "rating_top")
    private final java.lang.Integer ratingTop = null;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "reviews_text_count")
    private final java.lang.Integer reviewsTextCount = null;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "publishers")
    private final java.util.List<com.example.gamecatalogue.core.data.source.remote.response.PublishersItem> publishers = null;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "achievements_count")
    private final java.lang.Integer achievementsCount = null;
    @com.google.gson.annotations.SerializedName(value = "id")
    private final int id = 0;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "parent_platforms")
    private final java.util.List<com.example.gamecatalogue.core.data.source.remote.response.ParentPlatformsItem> parentPlatforms = null;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "reddit_name")
    private final java.lang.String redditName = null;
    @com.google.gson.annotations.SerializedName(value = "ratings_count")
    private final int ratingsCount = 0;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "slug")
    private final java.lang.String slug = null;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "released")
    private final java.lang.String released = null;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "youtube_count")
    private final java.lang.Integer youtubeCount = null;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "movies_count")
    private final java.lang.Integer moviesCount = null;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "description_raw")
    private final java.lang.String descriptionRaw = null;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "tags")
    private final java.util.List<com.example.gamecatalogue.core.data.source.remote.response.TagsItem> tags = null;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "background_image")
    private final java.lang.String backgroundImage = null;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "tba")
    private final java.lang.Boolean tba = null;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "dominant_color")
    private final java.lang.String dominantColor = null;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "name")
    private final java.lang.String name = null;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "reddit_description")
    private final java.lang.String redditDescription = null;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "reddit_logo")
    private final java.lang.String redditLogo = null;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "updated")
    private final java.lang.String updated = null;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "reviews_count")
    private final java.lang.Integer reviewsCount = null;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "metacritic")
    private final java.lang.Integer metacritic = null;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "description")
    private final java.lang.String description = null;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "metacritic_url")
    private final java.lang.String metacriticUrl = null;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "alternative_names")
    private final java.util.List<java.lang.String> alternativeNames = null;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "parents_count")
    private final java.lang.Integer parentsCount = null;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "user_game")
    private final java.lang.Object userGame = null;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "metacritic_platforms")
    private final java.util.List<com.example.gamecatalogue.core.data.source.remote.response.MetacriticPlatformsItem> metacriticPlatforms = null;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "creators_count")
    private final java.lang.Integer creatorsCount = null;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "ratings")
    private final java.util.List<com.example.gamecatalogue.core.data.source.remote.response.RatingsItem> ratings = null;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "genres")
    private final java.util.List<com.example.gamecatalogue.core.data.source.remote.response.GenresItem> genres = null;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "saturated_color")
    private final java.lang.String saturatedColor = null;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "added_by_status")
    private final com.example.gamecatalogue.core.data.source.remote.response.AddedByStatus addedByStatus = null;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "reddit_url")
    private final java.lang.String redditUrl = null;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "reddit_count")
    private final java.lang.Integer redditCount = null;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "parent_achievements_count")
    private final java.lang.Integer parentAchievementsCount = null;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "website")
    private final java.lang.String website = null;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "suggestions_count")
    private final java.lang.Integer suggestionsCount = null;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "stores")
    private final java.util.List<com.example.gamecatalogue.core.data.source.remote.response.StoresItem> stores = null;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "additions_count")
    private final java.lang.Integer additionsCount = null;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "twitch_count")
    private final java.lang.Integer twitchCount = null;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "background_image_additional")
    private final java.lang.String backgroundImageAdditional = null;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "esrb_rating")
    private final com.example.gamecatalogue.core.data.source.remote.response.EsrbRating esrbRating = null;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "screenshots_count")
    private final java.lang.Integer screenshotsCount = null;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "reactions")
    private final com.example.gamecatalogue.core.data.source.remote.response.Reactions reactions = null;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.SerializedName(value = "clip")
    private final java.lang.Object clip = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.example.gamecatalogue.core.data.source.remote.response.GameDetailResponse copy(@org.jetbrains.annotations.Nullable
    java.lang.Integer added, @org.jetbrains.annotations.Nullable
    java.util.List<com.example.gamecatalogue.core.data.source.remote.response.DevelopersItem> developers, @org.jetbrains.annotations.Nullable
    java.lang.String nameOriginal, double rating, @org.jetbrains.annotations.Nullable
    java.lang.Integer gameSeriesCount, @org.jetbrains.annotations.Nullable
    java.lang.Integer playtime, @org.jetbrains.annotations.Nullable
    java.util.List<com.example.gamecatalogue.core.data.source.remote.response.PlatformsItem> platforms, @org.jetbrains.annotations.Nullable
    java.lang.Integer ratingTop, @org.jetbrains.annotations.Nullable
    java.lang.Integer reviewsTextCount, @org.jetbrains.annotations.Nullable
    java.util.List<com.example.gamecatalogue.core.data.source.remote.response.PublishersItem> publishers, @org.jetbrains.annotations.Nullable
    java.lang.Integer achievementsCount, int id, @org.jetbrains.annotations.Nullable
    java.util.List<com.example.gamecatalogue.core.data.source.remote.response.ParentPlatformsItem> parentPlatforms, @org.jetbrains.annotations.Nullable
    java.lang.String redditName, int ratingsCount, @org.jetbrains.annotations.Nullable
    java.lang.String slug, @org.jetbrains.annotations.NotNull
    java.lang.String released, @org.jetbrains.annotations.Nullable
    java.lang.Integer youtubeCount, @org.jetbrains.annotations.Nullable
    java.lang.Integer moviesCount, @org.jetbrains.annotations.NotNull
    java.lang.String descriptionRaw, @org.jetbrains.annotations.Nullable
    java.util.List<com.example.gamecatalogue.core.data.source.remote.response.TagsItem> tags, @org.jetbrains.annotations.NotNull
    java.lang.String backgroundImage, @org.jetbrains.annotations.Nullable
    java.lang.Boolean tba, @org.jetbrains.annotations.Nullable
    java.lang.String dominantColor, @org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.Nullable
    java.lang.String redditDescription, @org.jetbrains.annotations.Nullable
    java.lang.String redditLogo, @org.jetbrains.annotations.Nullable
    java.lang.String updated, @org.jetbrains.annotations.Nullable
    java.lang.Integer reviewsCount, @org.jetbrains.annotations.Nullable
    java.lang.Integer metacritic, @org.jetbrains.annotations.Nullable
    java.lang.String description, @org.jetbrains.annotations.Nullable
    java.lang.String metacriticUrl, @org.jetbrains.annotations.Nullable
    java.util.List<java.lang.String> alternativeNames, @org.jetbrains.annotations.Nullable
    java.lang.Integer parentsCount, @org.jetbrains.annotations.Nullable
    java.lang.Object userGame, @org.jetbrains.annotations.Nullable
    java.util.List<com.example.gamecatalogue.core.data.source.remote.response.MetacriticPlatformsItem> metacriticPlatforms, @org.jetbrains.annotations.Nullable
    java.lang.Integer creatorsCount, @org.jetbrains.annotations.Nullable
    java.util.List<com.example.gamecatalogue.core.data.source.remote.response.RatingsItem> ratings, @org.jetbrains.annotations.Nullable
    java.util.List<com.example.gamecatalogue.core.data.source.remote.response.GenresItem> genres, @org.jetbrains.annotations.Nullable
    java.lang.String saturatedColor, @org.jetbrains.annotations.Nullable
    com.example.gamecatalogue.core.data.source.remote.response.AddedByStatus addedByStatus, @org.jetbrains.annotations.Nullable
    java.lang.String redditUrl, @org.jetbrains.annotations.Nullable
    java.lang.Integer redditCount, @org.jetbrains.annotations.Nullable
    java.lang.Integer parentAchievementsCount, @org.jetbrains.annotations.NotNull
    java.lang.String website, @org.jetbrains.annotations.Nullable
    java.lang.Integer suggestionsCount, @org.jetbrains.annotations.Nullable
    java.util.List<com.example.gamecatalogue.core.data.source.remote.response.StoresItem> stores, @org.jetbrains.annotations.Nullable
    java.lang.Integer additionsCount, @org.jetbrains.annotations.Nullable
    java.lang.Integer twitchCount, @org.jetbrains.annotations.Nullable
    java.lang.String backgroundImageAdditional, @org.jetbrains.annotations.Nullable
    com.example.gamecatalogue.core.data.source.remote.response.EsrbRating esrbRating, @org.jetbrains.annotations.Nullable
    java.lang.Integer screenshotsCount, @org.jetbrains.annotations.Nullable
    com.example.gamecatalogue.core.data.source.remote.response.Reactions reactions, @org.jetbrains.annotations.Nullable
    java.lang.Object clip) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object p0) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public GameDetailResponse(@org.jetbrains.annotations.Nullable
    java.lang.Integer added, @org.jetbrains.annotations.Nullable
    java.util.List<com.example.gamecatalogue.core.data.source.remote.response.DevelopersItem> developers, @org.jetbrains.annotations.Nullable
    java.lang.String nameOriginal, double rating, @org.jetbrains.annotations.Nullable
    java.lang.Integer gameSeriesCount, @org.jetbrains.annotations.Nullable
    java.lang.Integer playtime, @org.jetbrains.annotations.Nullable
    java.util.List<com.example.gamecatalogue.core.data.source.remote.response.PlatformsItem> platforms, @org.jetbrains.annotations.Nullable
    java.lang.Integer ratingTop, @org.jetbrains.annotations.Nullable
    java.lang.Integer reviewsTextCount, @org.jetbrains.annotations.Nullable
    java.util.List<com.example.gamecatalogue.core.data.source.remote.response.PublishersItem> publishers, @org.jetbrains.annotations.Nullable
    java.lang.Integer achievementsCount, int id, @org.jetbrains.annotations.Nullable
    java.util.List<com.example.gamecatalogue.core.data.source.remote.response.ParentPlatformsItem> parentPlatforms, @org.jetbrains.annotations.Nullable
    java.lang.String redditName, int ratingsCount, @org.jetbrains.annotations.Nullable
    java.lang.String slug, @org.jetbrains.annotations.NotNull
    java.lang.String released, @org.jetbrains.annotations.Nullable
    java.lang.Integer youtubeCount, @org.jetbrains.annotations.Nullable
    java.lang.Integer moviesCount, @org.jetbrains.annotations.NotNull
    java.lang.String descriptionRaw, @org.jetbrains.annotations.Nullable
    java.util.List<com.example.gamecatalogue.core.data.source.remote.response.TagsItem> tags, @org.jetbrains.annotations.NotNull
    java.lang.String backgroundImage, @org.jetbrains.annotations.Nullable
    java.lang.Boolean tba, @org.jetbrains.annotations.Nullable
    java.lang.String dominantColor, @org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.Nullable
    java.lang.String redditDescription, @org.jetbrains.annotations.Nullable
    java.lang.String redditLogo, @org.jetbrains.annotations.Nullable
    java.lang.String updated, @org.jetbrains.annotations.Nullable
    java.lang.Integer reviewsCount, @org.jetbrains.annotations.Nullable
    java.lang.Integer metacritic, @org.jetbrains.annotations.Nullable
    java.lang.String description, @org.jetbrains.annotations.Nullable
    java.lang.String metacriticUrl, @org.jetbrains.annotations.Nullable
    java.util.List<java.lang.String> alternativeNames, @org.jetbrains.annotations.Nullable
    java.lang.Integer parentsCount, @org.jetbrains.annotations.Nullable
    java.lang.Object userGame, @org.jetbrains.annotations.Nullable
    java.util.List<com.example.gamecatalogue.core.data.source.remote.response.MetacriticPlatformsItem> metacriticPlatforms, @org.jetbrains.annotations.Nullable
    java.lang.Integer creatorsCount, @org.jetbrains.annotations.Nullable
    java.util.List<com.example.gamecatalogue.core.data.source.remote.response.RatingsItem> ratings, @org.jetbrains.annotations.Nullable
    java.util.List<com.example.gamecatalogue.core.data.source.remote.response.GenresItem> genres, @org.jetbrains.annotations.Nullable
    java.lang.String saturatedColor, @org.jetbrains.annotations.Nullable
    com.example.gamecatalogue.core.data.source.remote.response.AddedByStatus addedByStatus, @org.jetbrains.annotations.Nullable
    java.lang.String redditUrl, @org.jetbrains.annotations.Nullable
    java.lang.Integer redditCount, @org.jetbrains.annotations.Nullable
    java.lang.Integer parentAchievementsCount, @org.jetbrains.annotations.NotNull
    java.lang.String website, @org.jetbrains.annotations.Nullable
    java.lang.Integer suggestionsCount, @org.jetbrains.annotations.Nullable
    java.util.List<com.example.gamecatalogue.core.data.source.remote.response.StoresItem> stores, @org.jetbrains.annotations.Nullable
    java.lang.Integer additionsCount, @org.jetbrains.annotations.Nullable
    java.lang.Integer twitchCount, @org.jetbrains.annotations.Nullable
    java.lang.String backgroundImageAdditional, @org.jetbrains.annotations.Nullable
    com.example.gamecatalogue.core.data.source.remote.response.EsrbRating esrbRating, @org.jetbrains.annotations.Nullable
    java.lang.Integer screenshotsCount, @org.jetbrains.annotations.Nullable
    com.example.gamecatalogue.core.data.source.remote.response.Reactions reactions, @org.jetbrains.annotations.Nullable
    java.lang.Object clip) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getAdded() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.example.gamecatalogue.core.data.source.remote.response.DevelopersItem> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.example.gamecatalogue.core.data.source.remote.response.DevelopersItem> getDevelopers() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getNameOriginal() {
        return null;
    }
    
    public final double component4() {
        return 0.0;
    }
    
    public final double getRating() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getGameSeriesCount() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getPlaytime() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.example.gamecatalogue.core.data.source.remote.response.PlatformsItem> component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.example.gamecatalogue.core.data.source.remote.response.PlatformsItem> getPlatforms() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getRatingTop() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getReviewsTextCount() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.example.gamecatalogue.core.data.source.remote.response.PublishersItem> component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.example.gamecatalogue.core.data.source.remote.response.PublishersItem> getPublishers() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getAchievementsCount() {
        return null;
    }
    
    public final int component12() {
        return 0;
    }
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.example.gamecatalogue.core.data.source.remote.response.ParentPlatformsItem> component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.example.gamecatalogue.core.data.source.remote.response.ParentPlatformsItem> getParentPlatforms() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getRedditName() {
        return null;
    }
    
    public final int component15() {
        return 0;
    }
    
    public final int getRatingsCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getSlug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getReleased() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getYoutubeCount() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component19() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getMoviesCount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component20() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDescriptionRaw() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.example.gamecatalogue.core.data.source.remote.response.TagsItem> component21() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.example.gamecatalogue.core.data.source.remote.response.TagsItem> getTags() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component22() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getBackgroundImage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component23() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getTba() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component24() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getDominantColor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component25() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component26() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getRedditDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component27() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getRedditLogo() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component28() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getUpdated() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component29() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getReviewsCount() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component30() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getMetacritic() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component31() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component32() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getMetacriticUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<java.lang.String> component33() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<java.lang.String> getAlternativeNames() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component34() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getParentsCount() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object component35() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getUserGame() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.example.gamecatalogue.core.data.source.remote.response.MetacriticPlatformsItem> component36() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.example.gamecatalogue.core.data.source.remote.response.MetacriticPlatformsItem> getMetacriticPlatforms() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component37() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getCreatorsCount() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.example.gamecatalogue.core.data.source.remote.response.RatingsItem> component38() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.example.gamecatalogue.core.data.source.remote.response.RatingsItem> getRatings() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.example.gamecatalogue.core.data.source.remote.response.GenresItem> component39() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.example.gamecatalogue.core.data.source.remote.response.GenresItem> getGenres() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component40() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getSaturatedColor() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.gamecatalogue.core.data.source.remote.response.AddedByStatus component41() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.gamecatalogue.core.data.source.remote.response.AddedByStatus getAddedByStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component42() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getRedditUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component43() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getRedditCount() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component44() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getParentAchievementsCount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component45() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getWebsite() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component46() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getSuggestionsCount() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.example.gamecatalogue.core.data.source.remote.response.StoresItem> component47() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.example.gamecatalogue.core.data.source.remote.response.StoresItem> getStores() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component48() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getAdditionsCount() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component49() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getTwitchCount() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component50() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getBackgroundImageAdditional() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.gamecatalogue.core.data.source.remote.response.EsrbRating component51() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.gamecatalogue.core.data.source.remote.response.EsrbRating getEsrbRating() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component52() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getScreenshotsCount() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.gamecatalogue.core.data.source.remote.response.Reactions component53() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.gamecatalogue.core.data.source.remote.response.Reactions getReactions() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object component54() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getClip() {
        return null;
    }
}