/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 * 
 * This file is not intended to be easily readable and contains a number of 
 * coding conventions designed to improve portability and efficiency. Do not make
 * changes to this file unless you know what you are doing--modify the SWIG 
 * interface file instead. 
 * ----------------------------------------------------------------------------- */

#ifndef SWIG_AriaPy_WRAP_H_
#define SWIG_AriaPy_WRAP_H_

#include <map>
#include <string>


class SwigDirector_ArAction : public ArAction, public Swig::Director {

public:
    SwigDirector_ArAction(PyObject *self, char const *name, char const *description = "");
    virtual ~SwigDirector_ArAction();
    virtual bool isActive() const;
    virtual void activate();
    virtual void deactivate();
    virtual ArActionDesired *fire(ArActionDesired currentDesired);
    virtual void setRobot(ArRobot *robot);
    virtual int getNumArgs() const;
    virtual ArArg *getArg(int number);
    virtual char const *getName() const;
    virtual char const *getDescription() const;
    virtual ArActionDesired *getDesired();
    virtual ArActionDesired const *getDesired() const;
    virtual void log(bool verbose = true) const;


/* Internal Director utilities */
public:
    bool swig_get_inner(const char* name) const {
      std::map<std::string, bool>::const_iterator iv = inner.find(name);
      return (iv != inner.end() ? iv->second : false);
    }

    void swig_set_inner(const char* name, bool val) const
    { inner[name] = val;}

private:
    mutable std::map<std::string, bool> inner;


#if defined(SWIG_PYTHON_DIRECTOR_VTABLE)
/* VTable implementation */
    PyObject *swig_get_method(size_t method_index, const char *method_name) const {
      PyObject *method = vtable[method_index];
      if (!method) {
        swig::SwigVar_PyObject name = SWIG_Python_str_FromChar(method_name);
        method = PyObject_GetAttr(swig_get_self(), name);
        if (method == NULL) {
          std::string msg = "Method in class ArAction doesn't exist, undefined ";
          msg += method_name;
          Swig::DirectorMethodException::raise(msg.c_str());
        }
        vtable[method_index] = method;
      };
      return method;
    }
private:
    mutable swig::SwigVar_PyObject vtable[13];
#endif

};


#endif
