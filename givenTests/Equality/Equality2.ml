type r = { f : int, g : int } ;;
(* Type r defined. *)

{f=1, g=2} = {g=2, f=1};;
(* - : bool = true *)

{f=1, g=3} = {g=1, f=2};;
(* - : bool = false *)
