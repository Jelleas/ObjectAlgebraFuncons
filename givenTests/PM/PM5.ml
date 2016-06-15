match (1,(2,3),4) with
    (a, ((e,f) as b),c) as d -> (a,b,c,d,e,f)
;;
(* - : int * (int * int) * int * (int * (int * int) * int) * int * int = (1, (2, 3), 4, (1, (2, 3), 4), 2, 3) *)

match true with
    false -> 1
  | true -> 2
;;
(* - : int = 2 *)

match false with
    true -> 1
  | false -> 2
;;
(* - : int = 2 *)

