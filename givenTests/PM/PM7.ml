type r2 = {g : int ; h : int} ;;
(* Type r1 defined. *)

match {g=1; h=2} with
    {g=3} -> 4
  | _     -> 5
;;
(* - : int =  5 *)

match {g=6; h=7} with
    {h=x; g=y} -> (x,y)
  | _          -> (8,9)
;;
(* - : int * int = 7, 6 *)

match {g=11;h=12} with
    {h=x} -> x
  | _     -> 13
;;
  
(* - : int = 12 *)
