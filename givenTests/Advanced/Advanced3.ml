let rec f = function 0 -> (7, 9)
                   | x -> (g x)
    and g = function y -> match f 0 with
                            (m,n) -> (y,m) ;;
(*
  f : int -> int * int = <fun>
  g : int -> int * int = <fun>
*)

f 3 ;;
(* - : int * int = 3, 7 *)
