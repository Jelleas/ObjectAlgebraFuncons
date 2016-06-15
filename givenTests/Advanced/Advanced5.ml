type 'a maybe = Nothing | Just of 'a;;
(* Type maybe defined. *)

let elim_maybe n j = function Nothing -> n
                            | Just x  -> (j x) ;;
(* elim_maybe : 'a -> ('b -> 'a) -> 'b maybe -> 'a = <fun> *)

let safehead = function []     -> Nothing
                      | [h :: _] -> (Just h) ;;
(* safehead : 'a list -> 'a maybe = <fun> *)

let id x = x;;
(* id : 'a -> 'a = <fun> *)

elim_maybe 0 id (safehead []);;
(* - : int = 0 *)

elim_maybe 0 id (safehead [1,2]);;
(* - : int = 1 *)
