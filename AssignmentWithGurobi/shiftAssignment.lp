\ LP format - for model browsing. Use MPS format to capture full model detail.
Minimize
  0 X(AmyMon1) + 12 X(BobMon1) + 0 X(CathyMon1) + 0 X(DanMon1) + 8 X(EdMon1)
   + 9 X(FredMon1) + 11 X(GuMon1) + 10 X(AmyTue2) + 12 X(BobTue2)
   + 0 X(CathyTue2) + 8 X(DanTue2) + 8 X(EdTue2) + 9 X(FredTue2)
   + 11 X(GuTue2) + 10 X(AmyWed3) + 0 X(BobWed3) + 10 X(CathyWed3)
   + 8 X(DanWed3) + 8 X(EdWed3) + 9 X(FredWed3) + 11 X(GuWed3)
   + 0 X(AmyThu4) + 12 X(BobThu4) + 10 X(CathyThu4) + 0 X(DanThu4)
   + 8 X(EdThu4) + 9 X(FredThu4) + 0 X(GuThu4) + 10 X(AmyFri5)
   + 12 X(BobFri5) + 10 X(CathyFri5) + 8 X(DanFri5) + 8 X(EdFri5)
   + 0 X(FredFri5) + 11 X(GuFri5) + 0 X(AmySat6) + 12 X(BobSat6)
   + 10 X(CathySat6) + 8 X(DanSat6) + 8 X(EdSat6) + 9 X(FredSat6)
   + 11 X(GuSat6) + 10 X(AmySun7) + 12 X(BobSun7) + 10 X(CathySun7)
   + 0 X(DanSun7) + 8 X(EdSun7) + 0 X(FredSun7) + 11 X(GuSun7)
   + 0 X(AmyMon8) + 12 X(BobMon8) + 10 X(CathyMon8) + 8 X(DanMon8)
   + 8 X(EdMon8) + 9 X(FredMon8) + 11 X(GuMon8) + 10 X(AmyTue9)
   + 0 X(BobTue9) + 10 X(CathyTue9) + 8 X(DanTue9) + 8 X(EdTue9)
   + 9 X(FredTue9) + 11 X(GuTue9) + 10 X(AmyWed10) + 0 X(BobWed10)
   + 10 X(CathyWed10) + 8 X(DanWed10) + 0 X(EdWed10) + 0 X(FredWed10)
   + 11 X(GuWed10) + 10 X(AmyThu11) + 12 X(BobThu11) + 10 X(CathyThu11)
   + 8 X(DanThu11) + 8 X(EdThu11) + 0 X(FredThu11) + 11 X(GuThu11)
   + 10 X(AmyFri12) + 12 X(BobFri12) + 10 X(CathyFri12) + 8 X(DanFri12)
   + 0 X(EdFri12) + 9 X(FredFri12) + 11 X(GuFri12) + 10 X(AmySat13)
   + 12 X(BobSat13) + 10 X(CathySat13) + 8 X(DanSat13) + 8 X(EdSat13)
   + 9 X(FredSat13) + 11 X(GuSat13) + 10 X(AmySun14) + 0 X(BobSun14)
   + 10 X(CathySun14) + 8 X(DanSun14) + 8 X(EdSun14) + 9 X(FredSun14)
   + 11 X(GuSun14)
Subject To
 Mon1: X(BobMon1) + X(EdMon1) + X(FredMon1) + X(GuMon1) >= 3
 Tue2: X(AmyTue2) + X(BobTue2) + X(DanTue2) + X(EdTue2) + X(FredTue2)
   + X(GuTue2) >= 2
 Wed3: X(AmyWed3) + X(CathyWed3) + X(DanWed3) + X(EdWed3) + X(FredWed3)
   + X(GuWed3) >= 4
 Thu4: X(BobThu4) + X(CathyThu4) + X(EdThu4) + X(FredThu4) >= 4
 Fri5: X(AmyFri5) + X(BobFri5) + X(CathyFri5) + X(DanFri5) + X(EdFri5)
   + X(GuFri5) >= 5
 Sat6: X(BobSat6) + X(CathySat6) + X(DanSat6) + X(EdSat6) + X(FredSat6)
   + X(GuSat6) >= 6
 Sun7: X(AmySun7) + X(BobSun7) + X(CathySun7) + X(EdSun7) + X(GuSun7) >= 5
 Mon8: X(BobMon8) + X(CathyMon8) + X(DanMon8) + X(EdMon8) + X(FredMon8)
   + X(GuMon8) >= 2
 Tue9: X(AmyTue9) + X(CathyTue9) + X(DanTue9) + X(EdTue9) + X(FredTue9)
   + X(GuTue9) >= 2
 Wed10: X(AmyWed10) + X(CathyWed10) + X(DanWed10) + X(GuWed10) >= 3
 Thu11: X(AmyThu11) + X(BobThu11) + X(CathyThu11) + X(DanThu11)
   + X(EdThu11) + X(GuThu11) >= 4
 Fri12: X(AmyFri12) + X(BobFri12) + X(CathyFri12) + X(DanFri12)
   + X(FredFri12) + X(GuFri12) >= 6
 Sat13: X(AmySat13) + X(BobSat13) + X(CathySat13) + X(DanSat13)
   + X(EdSat13) + X(FredSat13) + X(GuSat13) >= 7
 Sun14: X(AmySun14) + X(CathySun14) + X(DanSun14) + X(EdSun14)
   + X(FredSun14) + X(GuSun14) >= 5
Bounds
Binaries
 X(AmyMon1) X(BobMon1) X(CathyMon1) X(DanMon1) X(EdMon1) X(FredMon1)
 X(GuMon1) X(AmyTue2) X(BobTue2) X(CathyTue2) X(DanTue2) X(EdTue2)
 X(FredTue2) X(GuTue2) X(AmyWed3) X(BobWed3) X(CathyWed3) X(DanWed3)
 X(EdWed3) X(FredWed3) X(GuWed3) X(AmyThu4) X(BobThu4) X(CathyThu4)
 X(DanThu4) X(EdThu4) X(FredThu4) X(GuThu4) X(AmyFri5) X(BobFri5)
 X(CathyFri5) X(DanFri5) X(EdFri5) X(FredFri5) X(GuFri5) X(AmySat6)
 X(BobSat6) X(CathySat6) X(DanSat6) X(EdSat6) X(FredSat6) X(GuSat6)
 X(AmySun7) X(BobSun7) X(CathySun7) X(DanSun7) X(EdSun7) X(FredSun7)
 X(GuSun7) X(AmyMon8) X(BobMon8) X(CathyMon8) X(DanMon8) X(EdMon8)
 X(FredMon8) X(GuMon8) X(AmyTue9) X(BobTue9) X(CathyTue9) X(DanTue9)
 X(EdTue9) X(FredTue9) X(GuTue9) X(AmyWed10) X(BobWed10) X(CathyWed10)
 X(DanWed10) X(EdWed10) X(FredWed10) X(GuWed10) X(AmyThu11) X(BobThu11)
 X(CathyThu11) X(DanThu11) X(EdThu11) X(FredThu11) X(GuThu11) X(AmyFri12)
 X(BobFri12) X(CathyFri12) X(DanFri12) X(EdFri12) X(FredFri12) X(GuFri12)
 X(AmySat13) X(BobSat13) X(CathySat13) X(DanSat13) X(EdSat13) X(FredSat13)
 X(GuSat13) X(AmySun14) X(BobSun14) X(CathySun14) X(DanSun14) X(EdSun14)
 X(FredSun14) X(GuSun14)
End
